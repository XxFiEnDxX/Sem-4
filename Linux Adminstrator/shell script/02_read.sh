#!/bin/bash

echo "Enter 1st Subject Marks"
read sub1

echo "Enter 2st Subject Marks"
read sub2

echo "Enter 3st Subject Marks"
read sub3

echo "Enter 4st Subject Marks"
read sub4

echo "Enter 5st Subject Marks"
read sub5

((marks = (sub1+sub2+sub3+sub4+sub5)/5))

echo "student Percentage- "$marks"%"
