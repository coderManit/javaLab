// 34.
importjava.util.Scanner;
publicclassPerfectNumber{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Enteranumber:");
intnumber=input.nextInt();
intsumOfDivisors=0;
for(inti=1;i<=number/2;i++){
if(number%i==0){
sumOfDivisors+=i;
}
}
if(sumOfDivisors==number){
System.out.println(number+"isaperfectnumber.");
}else{

System.out.println(number+"isnotaperfectnumber.");
}
}
}