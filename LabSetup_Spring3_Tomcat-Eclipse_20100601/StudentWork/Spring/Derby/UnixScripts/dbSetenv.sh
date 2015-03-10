#!/bin/sh

#     *************************************************
#     this script sets up the environment for Derby

# This environment variable names the databse
export DB_NAME=jdbc:derby://localhost:1527/JavaTunesDB

# This environment variable points to the Derby install directory
export DERBY_INSTALL=lib

export CLASSPATH=.:$DERBY_INSTALL/derbytools.jar:$DERBY_INSTALL/derbynet.jar:$DERBY_INSTALL/derbyclient.jar:$DERBY_INSTALL/derby.jar:$CLASSPATH
