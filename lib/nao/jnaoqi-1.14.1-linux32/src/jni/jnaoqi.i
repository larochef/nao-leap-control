/**
 * Copyright (c) 2012 Aldebaran Robotics. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be
 * Found in the COPYING file.
*/
%module jnaoqi

%{
#include "javaproxy.h"
#include <alerror/alerror.h>
#include <typeinfo>
%}



%include exception.i
%include stl.i
%include "arrays_java.i"




// string array constructor

%typemap(jni)    (const std::vector<std::string> & as) "jobjectArray"
%typemap(jtype)  (const std::vector<std::string> & as) "String[]"
%typemap(jstype) (const std::vector<std::string> & as) "String[]"
%typemap(javain) (const std::vector<std::string> & as) "$javainput"

%typemap(in) (const std::vector<std::string> & as)(jobjectArray *jsarray) {
    if (jarg1 == NULL)
    {
        printf("NULL arraystring parameter\n");
        return NULL;
    }
    jint sizeArray = jenv->GetArrayLength((jarray) jarg1);
    $1 = new std::vector<std::string>();

    int i;
    for (i=0 ; i<sizeArray ; i++)
    {
          // get jobject
          jobject nativeObject = jenv->GetObjectArrayElement(jarg1, i);

          if (nativeObject == NULL)
          {
              nativeObject = (jobject) jenv->NewStringUTF("");
          }

          // cast to jstring
          jstring string = (jstring) nativeObject;


          if (nativeObject == NULL)
          {
              printf("cannot convert jobject to jstring\n");
          }

          jboolean bol;
          bol = (jboolean) true;

          const char* cString = jenv->GetStringUTFChars(string, &bol);
          $1->push_back(std::string(cString));
    }
}

// int array constructor

%typemap(jni) (const std::vector<int> & ai) "jintArray"
%typemap(jtype) (const std::vector<int> & ai) "int[]"
%typemap(jstype) (const std::vector<int> & ai) "int[]"
%typemap(javain) (const std::vector<int> & ai) "$javainput"

%typemap(in) (const std::vector<int> & ai)(jintArray *jsarray) {
    if (jarg1 == NULL)
    {
        printf("NULL arrayint parameter\n");
        return NULL;
    }
    jint sizeArray = jenv->GetArrayLength((jarray) jarg1);
    $1 = new std::vector<int>();

    jint *nativeInt = jenv->GetIntArrayElements(jarg1, 0);
    int i;
    for (i=0 ; i<sizeArray ; i++)
    {
        $1->push_back(nativeInt[i]);
    }
}


// float array constructor

%typemap(jni) (const std::vector<float> & af) "jfloatArray"
%typemap(jtype) (const std::vector<float> & af) "float[]"
%typemap(jstype) (const std::vector<float> & af) "float[]"
%typemap(javain) (const std::vector<float> & af) "$javainput"

%typemap(in) (const std::vector<float> & af)(jfloatArray *jsarray) {
    fflush(NULL);
    if (jarg1 == NULL)
    {
        printf("NULL arrayfloat parameter\n");
        return NULL;
    }
    jint sizeArray = jenv->GetArrayLength((jarray) jarg1);
    $1 = new std::vector<float>();

    jfloat *nativeFloat = jenv->GetFloatArrayElements(jarg1, 0);
    int i;
    for (i=0 ; i<sizeArray ; i++)
    {
        $1->push_back(nativeFloat[i]);
    }
}


// binary constructor


%typemap(jni) (char **b, int size) "jbyteArray"
%typemap(jtype) (char **b, int size) "byte[]"
%typemap(jstype) (char **b, int size) "byte[]"
%typemap(javain) (char **b, int size) "$javainput"

%typemap(in) (char **b, int size)(jbyteArray *jsarray) {
    if (jarg1 == NULL)
    {
        printf("NULL arraychar parameter\n");
        return NULL;
    }
    jint sizeArray = jenv->GetArrayLength((jarray) jarg1);
    arg2 = sizeArray;

    $1 = new (char*);
    *$1= (char*) malloc((int)sizeArray+1);

    int i;

    jbyte *nativeString = jenv->GetByteArrayElements(jarg1, 0);
    for (i=0 ; i<sizeArray ; i++)
    {
       (*$1)[i] = (char) nativeString[i];
    }

}

//%typemap(argout) (const std::string &s) ""

%typemap(freearg)  (char **b, int size){
    delete *$1;
}


// get binary


%typemap(out) jbyteArray  toBinary()
%{
     int bSize = arg1->getSize();
     $result = jenv->NewByteArray((jsize)(bSize));
     jbyte *b = (jbyte *)malloc(bSize*sizeof(jbyte));
     char *buff = arg1->getBuffer();
     int i;
     for (i=0 ; i<bSize ; i++)
     {
        b[i] = buff[i];
     }
    jenv->SetByteArrayRegion($result, (jsize)0, (jsize)(bSize), (jbyte*)b);
%}


// get float array

%typemap(out) jfloatArray toFloatArray()
%{
    int bSize = arg1->getSize();
    if (arg1->toALValue().getType() == AL::ALValue::TypeArray)
    {
        $result = jenv->NewFloatArray(bSize);
        jfloat *f = (jfloat *)malloc(bSize*sizeof(jfloat));
        int i;
        for (i = 0 ; i < arg1->getSize() ; i++)
        {
            float val = arg1->toALValue()[i];
            f[i] = (jfloat) (val);
        }
        jenv->SetFloatArrayRegion($result, (jsize)0, (jsize)(bSize), (jfloat*)f);
    }
    else
    {
       printf("toFloatArray: Variant is not an arrays");
    }
%}


// get int array

%typemap(out) jintArray toIntArray()
%{
    int bSize = arg1->getSize();
    if (arg1->toALValue().getType() == AL::ALValue::TypeArray)
    {
        $result = jenv->NewIntArray(bSize);
        jint *f = (jint *)malloc(bSize*sizeof(jint));
        int i;
        for (i = 0 ; i < arg1->getSize() ; i++)
        {
            int val = arg1->toALValue()[i];
            f[i] = (jint) (val);
        }
        jenv->SetIntArrayRegion($result, (jsize)0, (jsize)(bSize), (jint*)f);
    }
    else
    {
       printf("toIntArray: Variant is not an arrays");
    }
%}

// get string array

%typemap(out) jobjectArray toStringArray()
%{
    int bSize = arg1->getSize();
    if (arg1->toALValue().getType() == AL::ALValue::TypeArray)
    {
        $result=(jobjectArray)jenv->NewObjectArray(bSize,
          jenv->FindClass("java/lang/String"),
          jenv->NewStringUTF(""));

        //jstring **f;
        //f = (jstring **)malloc(bSize*sizeof(jstring));
        int i;
        for (i = 0 ; i < arg1->getSize() ; i++)
        {
            std::string val = arg1->toALValue()[i];
            jstring jval = jenv->NewStringUTF(val.c_str());

            jenv->SetObjectArrayElement($result, i, jval);
        }
        //jenv->SetIntArrayRegion($result, (jsize)0, (jsize)(bSize), (jint*)f);
    }
    else
    {
       printf("toIntArray: Variant is not an arrays");
    }
%}



%exception
 {
    try
    {
      $function
    }
    catch (AL::ALError e)
    {
      SWIG_exception(SWIG_RuntimeError, e.toString().c_str());
    }
}




%include "javaproxy.h"


