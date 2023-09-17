// 48.
importjava.util.Scanner;
publicclassReverseNumber{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Enteranumber:");
intnumber=input.nextInt();
intreversedNumber=0;
while(number!=0){
intdigit=number%10;
reversedNumber=reversedNumber*10+digit;
number/=10;
}
System.out.println("Reversednumber:"+reversedNumber);
}
}