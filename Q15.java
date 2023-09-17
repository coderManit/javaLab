// 15.
importjava.util.Scanner;
publicclassPrismVolume{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Enterthebaseareaoftheprism:");
doublebaseArea=input.nextDouble();
System.out.print("Entertheheightoftheprism:");
doubleheight=input.nextDouble();
doublevolume=baseArea*height;
System.out.println("Thevolumeoftheprismis:"+volume);
}
}