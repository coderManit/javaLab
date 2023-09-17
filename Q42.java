// 42.
importjava.util.Scanner;
publicclassOctalToHexadecimal{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Enteranoctalnumber:");
StringoctalNumber=input.next();
//Convertoctaltodecimal
intdecimalNumber=Integer.parseInt(octalNumber,8);
//Convertdecimaltohexadecimal
StringhexadecimalNumber=Integer.toHexString(decimalNumber);
System.out.println("Hexadecimalequivalent:"+hexadecimalNumber);
}
}