// 44.
importjava.util.Scanner;

publicclassDecimalToOctal{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Enteradecimalnumber:");
intdecimalNumber=input.nextInt();
//Convertdecimaltooctal
StringoctalNumber=Integer.toOctalString(decimalNumber);
System.out.println("Octalequivalent:"+octalNumber);
}
}