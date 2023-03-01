#!/bin/bash


#$((expression))
echo $((x = 3, y = 3, x+y))
echo "2 + 3 = "$((2+3))
awk 'BEGIN {x=2; y=1; print "x + y = "(x+y)}'
echo "2 3 + p" | dc
echo "10 + 20" | bc
((x=2 ,y =5, a=x+y, b=x/y, c=x*y));echo $a, $b, $c
((x++, y--));echo $x , $y

((n = 10, m = 20))
echo $((n+m)) ,$n ,$m

