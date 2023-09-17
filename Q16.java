// 16.
importjava.util.Scanner;
publicclassCylinderVolume{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Entertheradiusofthebaseofthecylinder:");
doubleradius=input.nextDouble();
System.out.print("Entertheheightofthecylinder:");
doubleheight=input.nextDouble();
doublevolume=Math.PI*Math.pow(radius,2)*height;
System.out.println("Thevolumeofthecylinderis:"+volume);

}
}