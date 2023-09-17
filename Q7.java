// 7.
importjava.util.Scanner;
publicclassEquilateralTriangleArea{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Enterthesidelengthoftheequilateraltriangle:");
doubleside=input.nextDouble();
doublearea=(Math.sqrt(3)/4)*Math.pow(side,2);
System.out.println("Theareaoftheequilateraltriangleis:"+area);
}
}