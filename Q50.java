// 50.
importjava.util.Scanner;
publicclassInsertElementInArray{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Enterthenumberofelementsinthearray:");
intn=input.nextInt();
int[]arr=newint[n+1];
System.out.println("Entertheelementsofthearray:");
for(inti=0;i<n;i++){
arr[i]=input.nextInt();
}

System.out.print("Enterthepositiontoinserttheelement(0-basedindex):");
intposition=input.nextInt();
System.out.print("Entertheelementtoinsert:");
intelement=input.nextInt();
//Shiftelementstomakespaceforthenewelement
for(inti=n;i>position;i--){
arr[i]=arr[i-1];
}
//Inserttheelementatthespecifiedposition
arr[position]=element;
System.out.println("Arrayafterinsertion:");
for(inti=0;i<n+1;i++){
System.out.print(arr[i]+"");
}
}
}