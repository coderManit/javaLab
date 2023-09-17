// 8.
importjava.util.Scanner;
publicclassCirclePerimeter{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Entertheradiusofthecircle:");
doubleradius=input.nextDouble();
doubleperimeter=2*Math.PI*radius;
System.out.println("Theperimeterofthecircleis:"+perimeter);
}

}