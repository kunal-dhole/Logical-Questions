package com.logical;

import java.util.Arrays;

public  class Frequency {
 public static  void main(String[] args) {
	char[] ch = {'a','b','a','d'};
    // ch [a][b][a][d]

int[] frequency=new int[26];//[2][1][0][1][][][][]
                              // 0  1  2  3
for(int c : ch)
{
int j=c-97;
frequency[j]=frequency[j] +1;
}

System.out.println(Arrays.toString(frequency));

for(int index=0;index<26;index++)
{
int asciiValue = index+97;
char pk = (char) asciiValue;//d

if(frequency[index] !=0)
System.out.println(pk + " has occured " + frequency[index]);
}
}
}
