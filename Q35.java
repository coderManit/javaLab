// 35.
importjava.util.Scanner;
publicclassMatrixMultiplication{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("EnterthenumberofrowsformatrixA:");
introwsA=input.nextInt();
System.out.print("EnterthenumberofcolumnsformatrixA:");
intcolumnsA=input.nextInt();
System.out.print("EnterthenumberofrowsformatrixB:");
introwsB=input.nextInt();
System.out.print("EnterthenumberofcolumnsformatrixB:");
intcolumnsB=input.nextInt();
if(columnsA!=rowsB){
System.out.println("Matrixmultiplicationisnotpossible.");
}else{
int[][]matrixA=newint[rowsA][columnsA];
int[][]matrixB=newint[rowsB][columnsB];
int[][]product=newint[rowsA][columnsB];
System.out.println("EnterelementsofmatrixA:");
for(inti=0;i<rowsA;i++){
for(intj=0;j<columnsA;j++){
matrixA[i][j]=input.nextInt();
}
}
System.out.println("EnterelementsofmatrixB:");
for(inti=0;i<rowsB;i++){
for(intj=0;j<columnsB;j++){
matrixB[i][j]=input.nextInt();
}
}

//Performmatrixmultiplication
for(inti=0;i<rowsA;i++){
for(intj=0;j<columnsB;j++){
for(intk=0;k<columnsA;k++){
product[i][j]+=matrixA[i][k]*matrixB[k][j];
}
}
}
System.out.println("Resultantmatrixaftermultiplication:");
for(inti=0;i<rowsA;i++){
for(intj=0;j<columnsB;j++){
System.out.print(product[i][j]+"");
}
System.out.println();
}
}
}
}