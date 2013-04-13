/**
 * Copyright (c) 2012 Aldebaran Robotics. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be
 * Found in the COPYING file.
 */

#include "javaproxy.h"
#include <alvalue/alvalue.h>
#include <alremotecall/alremoteproxy.h>

#include <iostream>
#include <vector>
#include <string>

using namespace std;

Variant::Variant(int a)
{
    fType = VINT;
    fValue =  a;
}


Variant::Variant(float f)
{
    fType = VFLOAT;
    fValue =  f;
}


Variant::Variant(const Variant &s)
{
    fType = s.getType();
    fValue = *(s.getValue());
}

Variant::Variant(const std::string &s)
{
    fType = VSTRING;
    fValue = s;
}

Variant::Variant (char **b, int size)
{
    fType = Variant::VBINARY;
    fValue.SetBinary(*b, size);
}


Variant::Variant (const std::vector<std::string> & as)
{
    fValue = as;
}

Variant::Variant (bool b)
{
    fType = VBOOL;
    fValue = b;
}


Variant::Variant (const std::vector<float> & af)
{
    fValue = af;
}

Variant::Variant (const std::vector<int> & ai)
{
    fValue = ai;
}

AL::ALValue Variant::toALValue() const
{
    return fValue;
}


Variant::typeV Variant::getType(void) const
{
    return fType;
}

const AL::ALValue *Variant::getValue(void) const
{
    return &fValue;
}




int Variant::toInt(void)
{
    return (int) fValue;
}

std::string Variant::toString(void)
{
    return (std::string) fValue;
}

float Variant::toFloat(void)
{
    return (float) fValue;
}


bool Variant::toBoolean(void)
{
    return (bool) fValue;
}

void Variant::fromALValue(const AL::ALValue &val)
{

  if (val.getType() == AL::ALValue::TypeInvalid)
  {
    // nothing to do
  }
  else if (val.getType() == AL::ALValue::TypeArray)
  {
    fType = VARRAY;
    fValue = val;
  }
  else if (val.getType()==AL::ALValue::TypeInt)
  {
    fType = VINT;
    fValue = val;
  }
  else if (val.getType()== AL::ALValue::TypeString)
  {
    fType == VSTRING;
    fValue = val;
  }
  else if (val.getType()== AL::ALValue::TypeBinary)
  {
    fType == VCHARARRAY;
    fValue = val;
  }
  else if (val.getType()== AL::ALValue::TypeBool)
  {
    fType == VBOOL;
    fValue = val;
  }
  else if (val.getType()== AL::ALValue::TypeFloat)
  {
    fType == VFLOAT;
    fValue = val;
  }
  else
  {
    printf("unknow type %d\n",val.getType());
  }
}


void Variant::push_back(const Variant &v)
{
    fType = VARRAY;
    fValue.arrayPush(v.toALValue());
}

Variant Variant::getElement(int i)
{
    if (fValue.getSize()>=i)
    {
        if (fValue[i].getType()== AL::ALValue::TypeBinary)
        {
             char *v = (char *) fValue[i].GetBinary();
             return Variant(&v, fValue[i].getSize());
        }
    }
    Variant res;
    res.fromALValue(fValue[i]);
    return res;

}


int Variant::getSize()
{
    return fValue.getSize();
}


char *Variant::getBuffer()
{
    return (char *) fValue.GetBinary();
}

ALProxy::ALProxy(const string &moduleName, const string &ip, int port)
{
    fProxy = new AL::ALProxyRemote(moduleName, ip, port);
}


ALProxy::~ALProxy()
{
}


Variant ALProxy::call(const std::string &method)
{
    AL::ALValue param;
    AL::ALValue result;
    Variant vResult(0);
    fProxy->genericCall(method, param,result);
    vResult.fromALValue(result);
    return vResult;
}


Variant ALProxy::call(const std::string &method, const Variant &val)
{
    AL::ALValue param;
    AL::ALValue result;
    Variant vResult(0);
    param.arrayPush(val.toALValue());
    fProxy->genericCall(method, param,result);
    vResult.fromALValue(result);
    return vResult;
}


Variant ALProxy::call(const std::string &method, const Variant &val1, const Variant &val2)
{
    AL::ALValue param;
    AL::ALValue result;
    Variant resJava;
    param.arrayPush(val1.toALValue());
    param.arrayPush(val2.toALValue());
    fProxy->genericCall(method, param,result);
    resJava.fromALValue(result);
    return resJava;
}

Variant ALProxy::call(const std::string &method, const Variant &val1, const Variant &val2,const Variant &val3)
{
    AL::ALValue param;
    AL::ALValue result;
    Variant resJava;
    param.arrayPush(val1.toALValue());
    param.arrayPush(val2.toALValue());
    param.arrayPush(val3.toALValue());
    fProxy->genericCall(method, param,result);
    resJava.fromALValue(result);
    return resJava;
}


Variant ALProxy::call(const std::string &method, const Variant &val1, const Variant &val2,const Variant &val3, const Variant &val4)
{
    AL::ALValue param;
    AL::ALValue result;
    Variant resJava;
    param.arrayPush(val1.toALValue());
    param.arrayPush(val2.toALValue());
    param.arrayPush(val3.toALValue());
    param.arrayPush(val4.toALValue());
    fProxy->genericCall(method, param,result);
    resJava.fromALValue(result);
    return resJava;
}


Variant ALProxy::call(const std::string &method, const Variant &val1, const Variant &val2,const Variant &val3, const Variant &val4, const Variant &val5)
{
    AL::ALValue param;
    AL::ALValue result;
    Variant resJava;
    param.arrayPush(val1.toALValue());
    param.arrayPush(val2.toALValue());
    param.arrayPush(val3.toALValue());
    param.arrayPush(val4.toALValue());
    param.arrayPush(val5.toALValue());
    fProxy->genericCall(method, param,result);
    resJava.fromALValue(result);
    return resJava;
}

Variant ALProxy::call(const std::string &method, const Variant &val1, const Variant &val2,const Variant &val3, const Variant &val4, const Variant &val5, const Variant &val6)
{
    AL::ALValue param;
    AL::ALValue result;
    Variant resJava;
    param.arrayPush(val1.toALValue());
    param.arrayPush(val2.toALValue());
    param.arrayPush(val3.toALValue());
    param.arrayPush(val4.toALValue());
    param.arrayPush(val5.toALValue());
    param.arrayPush(val6.toALValue());
    fProxy->genericCall(method, param,result);
    resJava.fromALValue(result);
    return resJava;
}
