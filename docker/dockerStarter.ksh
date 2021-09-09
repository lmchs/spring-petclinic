#!/bin/bash
echo $1
profile=$1

jarArgs=""
java -jar -Dspring.profiles.active="${profile}" /*.jar $jarArgs