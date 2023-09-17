// 40.

importjava.util.Scanner;
publicclassPrimeNumber{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Enteranumber:");
intnumber=input.nextInt();
booleanisPrime=true;
if(number<=1){
isPrime=false;
}else{
for(inti=2;i<=Math.sqrt(number);i++){
if(number%i==0){
isPrime=false;
break;
}
}
}
if(isPrime){
System.out.println(number+"isaprimenumber.");
}else{
System.out.println(number+"isnotaprimenumber.");
}
}
}