#!/bin/bash

mkdir p_directory

cd p_directory

for i in 1 2
do
	echo -e 'a@mi*\nKum@ar\n$singh\n#@this\nis\nme' > file-$i.txt
	sed -i 's/[@*#$]//g' file-$i.txt
	cat ./file-$i.txt
done
