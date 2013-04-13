/**
 * Copyright (c) 2012 Aldebaran Robotics. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be
 * Found in the COPYING file.
 */

#ifndef ALJAVAPROXY_H
#define ALJAVAPROXY_H

#include <string>
#include <alvalue/alvalue.h>
#include <alremotecall/alremoteproxy.h>
#include <jni.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>


namespace AL
{
class ALBroker;
}


/**
 * \class Variant
 * \brief C++ ALValue cannot be wrapped by swig. Variant is a light ALValue compatible with Java world.
 * Jnaoqi wrapper is in beta version and open source. Provide your suggestion to Aldebaran-Robotics
 * Another elegant approch is to manage only java Objet and depending generic Object type, convert it to ALValue but:
 * 1) jni API is very light concerning type and type cast.
 * 2) int, float, bool are not objects
 * Variant is not visible in Java world, except if NaoQi API explicitly expose ALValue
 * \ingroup Java
 */

class Variant
{
public:
    enum typeV
    {
        VINT = 0,
        VBOOL = 1,
        VSTRING = 2,
        VCHARARRAY = 3,
        VFLOATARRAY = 4,
        VARRAY = 5,
        VINTARRAY = 6,
        VFLOAT = 7,
        VBINARY = 8,
    } variantType;


    Variant(){};

    /**
    * \brief Construct ALValue from int
    * \param param int value
    */
    Variant(int a);

    /**
    * \brief Construct ALValue from float
    * \param float value
    */
    Variant(float f);

    /**
    * \brief Construct ALValue from ALValue
    * \param ALValue value
    */
    Variant(const Variant &s);

    /**
    * \brief Construc ALValue from string
    * @return string value
    */
    Variant(const std::string &s);

    /**
    * \brief get ALValue type (in java we differenciate array float and array int
    * @return ALValue type
    */
    typeV getType(void) const;


    /**
    * \brief get ALValue pointer
    * @return ALValue pointer
    */
    const AL::ALValue *getValue(void) const;

    /**
    * \brief Construct ALValue from byte buffer
    * \param char buffer
    * \param size of buffer
    */
    Variant (char **b, int size);

    /**
    * \brief Construct ALValue from boolean
    * \param java boolean
    */
    Variant (bool b);


    /**
    * \brief Construct ALValue from java String[]
    * vector<string> type is managed in swig .i file
    * \param vector of string
    */
    Variant (const std::vector<std::string> & as);

    /**
    * \brief Construct ALValue from java float[]
    * vector<float> type is managed in swig .i file
    * \param vector of float
    */
    Variant (const std::vector<float> & af);

    /**
    * \brief Construct ALValue from java int[]
    * vector<int> type is managed in swig .i file
    * \param vector of int
    */
    Variant (const std::vector<int> & ai);


    /**
    * \brief return jint value of int ALValue
    * @return jint value
    */
    int toInt(void);

    /**
    * \brief return jstring value of std::string ALValue
    * @return jstring value
    */
    std::string toString(void);

    /**
    * \brief return jfloat value of float ALValue
    * @return jfloat value
    */
    float toFloat(void);

    /**
    * \brief return jboolean value of bool ALValue
    * @return jboolean value
    */
    bool toBoolean(void);

    /**
    * \brief add a C++ ALValue in java ALValue
    * \param java ALValue
    */
    void push_back(const Variant &v);

    /**
    * \brief get element from ALValue array
    * \param index of element
    */
    Variant getElement(int i);

    // java type jbyteArray managed in .i swig file

    /**
    * \brief get jbytearray from binary ALValue
    *java type jbyteArray managed in .i swig file
    * @return java jbytearray
    */
    jbyteArray  toBinary(){return NULL;}

    /**
    * \brief get jfloatArray from array ALValue
    * ALValue should contain only float
    *java type jfloatArray managed in .i swig file
    * @return java jfloatArray
    */
    jfloatArray  toFloatArray(){return NULL;}

    /**
    * \brief get toIntArray from array ALValue
    * ALValue should contain only int
    *java type toIntArray managed in .i swig file
    * @return java toIntArray
    */
    jintArray  toIntArray(){return NULL;}

    /**
    * \brief get jobjectArray from array ALValue
    * should be cast in String[] java side
    * ALValue should contain only string
    *java type jobjectArray managed in .i swig file
    * @return java jobjectArray
    */
    jobjectArray  toStringArray(){return NULL;}


    /**
    * \brief return ALValue size
    * @return size
    */
    int getSize();


    /**
    * \brief return char * from ALValue buffer
    * @return pointer on buffer
    */
    char *getBuffer();


    /**
    * \brief return ALValue copy fo ALValue
    * @return ALValue
    */
    AL::ALValue toALValue() const;


    /**
    * \brief Build ALValue from ALValue
    * \param ALValue
    */
    void fromALValue(const AL::ALValue &val);

    /**
    * Destructor
    */
    ~Variant(void)
    {
    }


private:
    typeV fType;
    AL::ALValue fValue;
};



/**
 * \class ALProxy
 * \brief ALProxy give an access to a module.
 * Constructor require robot address, robot port and module name.
 * One constructed an ALProxy allow to any bound method.
 * \ingroup Java
 */


class ALProxy
{

public:

    /**
     * Default Constructor.
     */
    ALProxy(const std::string &moduleName, const std::string &ip, int port );

    /**
     * Destructor.
     */
    virtual ~ALProxy();


    /**
    * \brief call method without parameter. In java we don't need to differenciate callVoid and call
    * \param Method name
    */
    Variant call(const std::string &method);

    /**
    * \brief call method with one parameter.
    * \param Method name
    * \param parameter
    */
    Variant call(const std::string &method, const Variant &val);

    /**
    * \brief call method with two parameters.
    * \param Method name
    * \param parameter
    * \param parameter
    */
    Variant call(const std::string &method, const Variant &val1, const Variant &val2);

    /**
    * \brief call method with three parameters.
    * \param Method name
    * \param parameter
    * \param parameter
    * \param parameter
    */
    Variant call(const std::string &method, const Variant &val1, const Variant &val2,const Variant &val3);

    /**
    * \brief call method with four parameters.
    * \param Method name
    * \param parameter
    * \param parameter
    * \param parameter
    * \param parameter
    */
    Variant call(const std::string &method, const Variant &val1, const Variant &val2,const Variant &val3, const Variant &val4);

    /**
    * \brief call method with five parameters.
    * \param Method name
    * \param parameter
    * \param parameter
    * \param parameter
    * \param parameter
    * \param parameter
    */
    Variant call(const std::string &method, const Variant &val1, const Variant &val2,const Variant &val3, const Variant &val4, const Variant &val5);


    /**
    * \brief call method with six parameters.
    * \param Method name
    * \param parameter
    * \param parameter
    * \param parameter
    * \param parameter
    * \param parameter
    * \param parameter
    */
    Variant call(const std::string &method, const Variant &val1, const Variant &val2,const Variant &val3, const Variant &val4, const Variant &val5, const Variant &val6);

private:
    AL::ALProxyRemote *fProxy;

};
#endif

