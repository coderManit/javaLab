// 38.
importjava.util.Scanner;
publicclassMatrixTranspose{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Enterthenumberofrowsandcolumnsforthematrix:");
introws=input.nextInt();
intcolumns=input.nextInt();
int[][]matrix=newint[rows][columns];
int[][]transpose=newint[columns][rows];
System.out.println("Enterelementsofthematrix:");
for(inti=0;i<rows;i++){
for(intj=0;j<columns;j++){
matrix[i][j]=input.nextInt();
}
}

//Findtransposeofthematrix
for(inti=0;i<rows;i++){
for(intj=0;j<columns;j++){
transpose[j][i]=matrix[i][j];
}
}
System.out.println("Transposeofthematrix:");
for(inti=0;i<columns;i++){
for(intj=0;j<rows;j++){
System.out.print(transpose[i][j]+"");
}
System.out.println();
}
}
}