// 37.
importjava.util.Scanner;
publicclassMatrixSubtraction{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Enterthenumberofrowsandcolumnsforthematrices:");
introws=input.nextInt();
intcolumns=input.nextInt();
int[][]matrixA=newint[rows][columns];
int[][]matrixB=newint[rows][columns];
int[][]difference=newint[rows][columns];
System.out.println("EnterelementsofmatrixA:");
for(inti=0;i<rows;i++){
for(intj=0;j<columns;j++){
matrixA[i][j]=input.nextInt();
}
}

System.out.println("EnterelementsofmatrixB:");
for(inti=0;i<rows;i++){
for(intj=0;j<columns;j++){
matrixB[i][j]=input.nextInt();
}
}
//Performmatrixsubtraction
for(inti=0;i<rows;i++){
for(intj=0;j<columns;j++){
difference[i][j]=matrixA[i][j]-matrixB[i][j];
}
}
System.out.println("Resultantmatrixaftersubtraction:");
for(inti=0;i<rows;i++){
for(intj=0;j<columns;j++){
System.out.print(difference[i][j]+"");
}
System.out.println();
}
}
}