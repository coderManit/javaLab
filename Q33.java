// 33.
importjava.util.Scanner;
publicclassVowelOrConsonant{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Enteracharacter:");
charch=input.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
System.out.println(ch+"isavowel.");
}else{
System.out.println(ch+"isaconsonant.");
}
}
}