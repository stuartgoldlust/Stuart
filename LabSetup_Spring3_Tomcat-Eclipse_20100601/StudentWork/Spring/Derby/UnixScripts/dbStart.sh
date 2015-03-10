#!/bin/sh

#     *************************************************
#     this script starts the Derby DB

. dbSetenv.sh

java org.apache.derby.drda.NetworkServerControl start
