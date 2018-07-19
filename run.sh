#!/bin/bash

for file in $( ls )
#for file in *
do
   # echo "file: $file"
   if [ -d "$file" ]; then
     echo " $file.jar 运行结果:"
     java -jar "$file/target/$file.jar"
   fi
done