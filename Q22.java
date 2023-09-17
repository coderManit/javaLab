// 22.
importjava.util.Scanner;
publicclassDistanceBetweenPoints{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Enterthecoordinatesofthefirstpoint(x1y1):");
doublex1=input.nextDouble();
doubley1=input.nextDouble();
System.out.print("Enterthecoordinatesofthesecondpoint(x2y2):");
doublex2=input.nextDouble();
doubley2=input.nextDouble();
doubledistance=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
System.out.println("Distancebetweenthetwopoints:"+distance);
}
}