## Copyright (c) 2012 Aldebaran Robotics. All rights reserved.
## Use of this source code is governed by a BSD-style license that can be
## found in the COPYING file.

find_package(SWIG REQUIRED)
include("${SWIG_USE_FILE}")

find_package(JNI)
include_directories(${JNI_INCLUDE_DIRS})

find_package(ALREMOTECALL)
include_directories(${ALREMOTECALL_INCLUDE_DIRS})

include_directories(".")

set_source_files_properties(jnaoqi.i PROPERTIES CPLUSPLUS ON)
set(CMAKE_SWIG_FLAGS  "-package" "com.aldebaran.proxy")
set(CMAKE_SWIG_OUTDIR ${CMAKE_CURRENT_SOURCE_DIR}/../java/com/aldebaran/proxy)
swig_add_module(jnaoqi java jnaoqi.i javaproxy.cpp)

qi_use_lib(jnaoqi ALREMOTECALL)
# java's System.loadLibrary requires a 'lib' prefix
if(WIN32)
  set(_out "${QI_SDK_BIN}")
else()
  set(_out "${QI_SDK_LIB}")
endif()

set_target_properties(jnaoqi PROPERTIES
  LIBRARY_OUTPUT_DIRECTORY  ${QI_SDK_DIR}/${QI_SDK_LIB})

install(TARGETS jnaoqi
  RUNTIME COMPONENT lib DESTINATION "lib"
  LIBRARY COMPONENT lib DESTINATION "lib")
