// 19.
importjava.util.Scanner;
publicclassFactorial{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Enterapositiveinteger:");

intnum=input.nextInt();
longfactorial=1;
for(inti=1;i<=num;i++){
factorial*=i;
}
System.out.println("Factorialof"+num+"is:"+factorial);
}
}