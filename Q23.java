// 23.
importjava.util.Scanner;
publicclassWeightedAverage{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Enterthenumberofelements:");
intn=input.nextInt();
doublesumOfProducts=0;
doublesumOfWeights=0;
System.out.println("Enter"+n+"elementsandtheircorrespondingweights:");

for(inti=0;i<n;i++){
doubleelement=input.nextDouble();
doubleweight=input.nextDouble();
sumOfProducts+=element*weight;
sumOfWeights+=weight;
}
doubleweightedAverage=sumOfProducts/sumOfWeights;
System.out.println("WeightedAverage:"+weightedAverage);
}
}