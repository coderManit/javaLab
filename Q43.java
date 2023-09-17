// 43.
importjava.util.Scanner;
publicclassDecimalToHexadecimal{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Enteradecimalnumber:");
intdecimalNumber=input.nextInt();
//Convertdecimaltohexadecimal
StringhexadecimalNumber=Integer.toHexString(decimalNumber);
System.out.println("Hexadecimalequivalent:"+hexadecimalNumber.toUpperCase());
}
}