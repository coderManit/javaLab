// 58.
publicclassHeapSort{
publicstaticvoidmain(String[]args){
int[]arr={12,11,13,5,6,7};
System.out.println("Originalarray:");
printArray(arr);
heapSort(arr);
System.out.println("Arrayafterheapsort:");
printArray(arr);
}
publicstaticvoidheapSort(int[]arr){
intn=arr.length;
//Buildamaxheap
for(inti=n/2-1;i>=0;i--){
heapify(arr,n,i);
}
//Extractelementsfromtheheaponebyone
for(inti=n-1;i>0;i--){
//Movethecurrentroottotheend
inttemp=arr[0];
arr[0]=arr[i];
arr[i]=temp;
//Callheapifyonthereducedheap
heapify(arr,i,0);
}
}
publicstaticvoidheapify(int[]arr,intn,inti){
intlargest=i;

intleft=2*i+1;
intright=2*i+2;
if(left<n&&arr[left]>arr[largest]){
largest=left;
}
if(right<n&&arr[right]>arr[largest]){
largest=right;
}
if(largest!=i){
intswap=arr[i];
arr[i]=arr[largest];
arr[largest]=swap;
heapify(arr,n,largest);
}
}
publicstaticvoidprintArray(int[]arr){
for(intvalue:arr){
System.out.print(value+"");
}
System.out.println();
}
}