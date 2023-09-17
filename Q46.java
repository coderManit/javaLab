// 46.
importjava.util.Scanner;
publicclassFahrenheitToCelsius{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("EntertemperatureinFahrenheit:");
doublefahrenheit=input.nextDouble();
doublecelsius=(fahrenheit-32)*5/9;
System.out.println("TemperatureinCelsius:"+celsius);
}
}