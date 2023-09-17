// 28.
importjava.util.Scanner;
publicclassSumOfNNumbers{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Enterthevalueofn:");
intn=input.nextInt();
intsum=0;
System.out.println("Enter"+n+"numbers:");
for(inti=0;i<n;i++){
intnum=input.nextInt();
sum+=num;
}
System.out.println("Sumofthe"+n+"numbersis:"+sum);
}
}