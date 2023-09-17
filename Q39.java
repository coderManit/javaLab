// 39.
importjava.util.Scanner;
publicclassLeapYear{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Enterayear:");
intyear=input.nextInt();
booleanisLeapYear=false;
if((year%4==0&&year%100!=0)||(year%400==0)){
isLeapYear=true;
}
if(isLeapYear){
System.out.println(year+"isaleapyear.");
}else{
System.out.println(year+"isnotaleapyear.");
}
}
}