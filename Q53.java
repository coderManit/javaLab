// 53.
publicclassMergeSort{
publicstaticvoidmain(String[]args){
int[]arr={12,11,13,5,6,7};
System.out.println("Originalarray:");
printArray(arr);
mergeSort(arr,0,arr.length-1);
System.out.println("Arrayaftermergesort:");
printArray(arr);
}
publicstaticvoidmergeSort(int[]arr,intleft,intright){
if(left<right){
intmid=left+(right-left)/2;
mergeSort(arr,left,mid);
mergeSort(arr,mid+1,right);

merge(arr,left,mid,right);
}
}
publicstaticvoidmerge(int[]arr,intleft,intmid,intright){
intn1=mid-left+1;
intn2=right-mid;
int[]L=newint[n1];
int[]R=newint[n2];
for(inti=0;i<n1;i++){
L[i]=arr[left+i];
}
for(inti=0;i<n2;i++){
R[i]=arr[mid+1+i];
}
inti=0,j=0,k=left;
while(i<n1&&j<n2){
if(L[i]<=R[j]){
arr[k]=L[i];
i++;
}else{
arr[k]=R[j];
j++;
}
k++;
}
while(i<n1){
arr[k]=L[i];
i++;
k++;
}
while(j<n2){
arr[k]=R[j];
j++;
k++;
}
}
publicstaticvoidprintArray(int[]arr){

for(intvalue:arr){
System.out.print(value+"");
}
System.out.println();
}
}