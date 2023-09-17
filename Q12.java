// 12.
importjava.util.Scanner;
publicclassSquarePerimeter{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Enterthesidelengthofthesquare:");
doubleside=input.nextDouble();
doubleperimeter=4*side;
System.out.println("Theperimeterofthesquareis:"+perimeter);
}
}