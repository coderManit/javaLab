// 1.
importjava.util.Scanner;
publicclassCircleArea{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Entertheradiusofthecircle:");
doubleradius=input.nextDouble();
doublearea=Math.PI*Math.pow(radius,2);
System.out.println("Theareaofthecircleis:"+area);
}
}