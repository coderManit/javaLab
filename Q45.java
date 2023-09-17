// 45.
importjava.util.Scanner;
publicclassDecimalToBinary{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Enteradecimalnumber:");
intdecimalNumber=input.nextInt();
//Convertdecimaltobinary
StringbinaryNumber=Integer.toBinaryString(decimalNumber);
System.out.println("Binaryequivalent:"+binaryNumber);
}
}