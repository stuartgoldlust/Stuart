#!/bin/sh

#     *************************************************
#     this script starts the Derby DB

. dbSetenv.sh

java -Dij.driver=org.apache.derby.jdbc.ClientDriver -Dij.database=$DB_NAME:create=true -Dij.user=guest -Dij.password=password org.apache.derby.tools.ij dbCreate.sql
