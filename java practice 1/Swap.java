class swap{


public static void main (String [] args)
{
int a= 100;
int b= 200;

//o/p-- a= 200 and b= 100
int temp; // temperary variable
temp = a;
a= b;
b =temp;
System.out.println(a);
System.out.println(b);