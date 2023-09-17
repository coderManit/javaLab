// 13.
importjava.util.Scanner;
publicclassRhombusPerimeter{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Enterthesidelengthoftherhombus:");
doubleside=input.nextDouble();
doubleperimeter=4*side;
System.out.println("Theperimeteroftherhombusis:"+perimeter);
}
}