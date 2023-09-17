// 32.
importjava.util.Scanner;
publicclassLCM{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Enterthefirstnumber:");
intnum1=input.nextInt();
System.out.print("Enterthesecondnumber:");
intnum2=input.nextInt();
intlarger=Math.max(num1,num2);
intlcm=larger;
while(true){
if(lcm%num1==0&&lcm%num2==0){
break;
}
lcm+=larger;
}

System.out.println("LCMof"+num1+"and"+num2+"is:"+lcm);
}
}