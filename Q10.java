// 10.
importjava.util.Scanner;
publicclassParallelogramPerimeter{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Enterthelengthofonesideoftheparallelogram:");
doubleside=input.nextDouble();
System.out.print("Enterthelengthoftheadjacentside:");
doubleadjacentSide=input.nextDouble();
doubleperimeter=2*(side+adjacentSide);
System.out.println("Theperimeteroftheparallelogramis:"+perimeter);
}
}