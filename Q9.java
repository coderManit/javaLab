// 9.
importjava.util.Scanner;
publicclassEquilateralTrianglePerimeter{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Enterthesidelengthoftheequilateraltriangle:");
doubleside=input.nextDouble();
doubleperimeter=3*side;
System.out.println("Theperimeteroftheequilateraltriangleis:"+perimeter);
}
}