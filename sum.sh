#!/bin/bash
read -p "Enter 20 numbers:" a
sum=0
for i in ${a[@]}
do
sum='expr $sum + $i'
done
echo "sum" $sum