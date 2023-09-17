// 20.
importjava.util.Scanner;
publicclassAverageOfNumbers{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Enterthenumberofelements:");
intn=input.nextInt();
doublesum=0;
System.out.println("Enter"+n+"numbers:");
for(inti=0;i<n;i++){
doublenum=input.nextDouble();
sum+=num;
}
doubleaverage=sum/n;
System.out.println("Averageofthenumbersis:"+average);
}
}