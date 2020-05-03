#!/bin/bash
read -p "Enter the first number:" n1
read -p "Enter the second number:" n2
if [ $n1 -gt $n2 ]
then
echo "Largest number is : "$n1
else
echo "Largest number is : "$n2
fi