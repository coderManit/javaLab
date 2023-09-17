// 30.
importjava.util.Scanner;
publicclassReverseString{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Enterastring:");
StringoriginalString=input.nextLine();
StringreversedString=newStringBuilder(originalString).reverse().toString();
System.out.println("Reversedstring:"+reversedString);
}
}