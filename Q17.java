// 17.
importjava.util.Scanner;
publicclassSphereVolume{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Entertheradiusofthesphere:");
doubleradius=input.nextDouble();
doublevolume=(4.0/3.0)*Math.PI*Math.pow(radius,3);
System.out.println("Thevolumeofthesphereis:"+volume);
}
}