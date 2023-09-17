// 26.
importjava.util.Scanner;
publicclassAverageMarks{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Enterthenumberofsubjects:");
intn=input.nextInt();
doublesumOfMarks=0;
System.out.println("Entermarksforeachsubject:");
for(inti=0;i<n;i++){
System.out.print("Entermarksforsubject"+(i+1)+":");
doublemarks=input.nextDouble();
sumOfMarks+=marks;
}
doubleaverageMarks=sumOfMarks/n;

System.out.println("AverageMarks:"+averageMarks);
}
}