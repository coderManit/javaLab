// 57.
publicclassInsertionSort{
publicstaticvoidmain(String[]args){
int[]arr={12,11,13,5,6};
System.out.println("Originalarray:");
printArray(arr);
insertionSort(arr);
System.out.println("Arrayafterinsertionsort:");
printArray(arr);
}
publicstaticvoidinsertionSort(int[]arr){
intn=arr.length;
for(inti=1;i<n;i++){
intkey=arr[i];
intj=i-1;
//Moveelementsofarr[0..i-1]thataregreaterthankey
//toonepositionaheadoftheircurrentposition
while(j>=0&&arr[j]>key){
arr[j+1]=arr[j];
j=j-1;
}
arr[j+1]=key;
}
}
publicstaticvoidprintArray(int[]arr){
for(intvalue:arr){
System.out.print(value+"");

}
System.out.println();
}
}