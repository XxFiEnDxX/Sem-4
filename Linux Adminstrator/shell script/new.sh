#!/bin/bash
a=10; b=20
c=$((++a))
let a=c+a
echo $a
exit 0
