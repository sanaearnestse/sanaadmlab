#!/bin/bash
i=1
sum=0
echo "Enter 20 numbers:"
while [ $i -le 20 ]
do
 read num
 sum=$((sum+num))
 i=$((i+1))
done
echo "Sum of 20 number is : "$sum