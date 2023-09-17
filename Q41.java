// 41.
importjava.util.Scanner;
publicclassSumOfDigits{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Enteranumber:");
intnumber=input.nextInt();
intsum=0;
while(number>0){
intdigit=number%10;
sum+=digit;
number/=10;

}
System.out.println("Sumofdigits:"+sum);
}
}