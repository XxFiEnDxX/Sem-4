#!/bin/bash

read -p "Enter the grade- " var

case $((   

(var >= 80 && var <= 90)      * 1 +   

(var > 70 && var  <= 79)   * 2)) in
	1)
		echo "You got Grade - A"
			;;
	2)
		echo "You got Grade - B"
			;;
	*)
		echo "You are Pass"
			;;
esac
