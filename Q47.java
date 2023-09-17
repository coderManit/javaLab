// 47.
importjava.util.Scanner;
publicclassCountVowels{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Enterastring:");
Stringstr=input.nextLine();
intvowelCount=0;
str=str.toLowerCase();//Converttolowercaseforcaseinsensitivity
for(inti=0;i<str.length();i++){
charch=str.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
vowelCount++;
}
}
System.out.println("Numberofvowelsinthestring:"+vowelCount);
}
}