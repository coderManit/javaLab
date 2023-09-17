// 14.
importjava.util.Scanner;
publicclassConeVolume{
publicstaticvoidmain(String[]args){

Scannerinput=newScanner(System.in);
System.out.print("Entertheradiusofthebaseofthecone:");
doubleradius=input.nextDouble();
System.out.print("Entertheheightofthecone:");
doubleheight=input.nextDouble();
doublevolume=(1.0/3.0)*Math.PI*Math.pow(radius,2)*height;
System.out.println("Thevolumeoftheconeis:"+volume);
}
}