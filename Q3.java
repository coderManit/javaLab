// 3.
importjava.util.Scanner;
publicclassRectangleArea{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Enterthelengthoftherectangle:");
doublelength=input.nextDouble();
System.out.print("Enterthewidthoftherectangle:");
doublewidth=input.nextDouble();

doublearea=length*width;
System.out.println("Theareaoftherectangleis:"+area);
}
}