// 2.
importjava.util.Scanner;
publicclassTriangleArea{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Enterthebaseofthetriangle:");
doublebase=input.nextDouble();
System.out.print("Entertheheightofthetriangle:");
doubleheight=input.nextDouble();
doublearea=0.5*base*height;
System.out.println("Theareaofthetriangleis:"+area);
}
}