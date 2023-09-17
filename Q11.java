// 11.
importjava.util.Scanner;
publicclassRectanglePerimeter{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Enterthelengthoftherectangle:");
doublelength=input.nextDouble();
System.out.print("Enterthewidthoftherectangle:");

doublewidth=input.nextDouble();
doubleperimeter=2*(length+width);
System.out.println("Theperimeteroftherectangleis:"+perimeter);
}
}