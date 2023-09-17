// 25.
importjava.util.Scanner;
publicclassCompoundInterest{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Entertheprincipalamount:");
doubleprincipal=input.nextDouble();
System.out.print("Entertheannualinterestrate(asadecimal):");
doublerate=input.nextDouble();
System.out.print("Enterthenumberoftimesinterestiscompoundedperyear:");
intn=input.nextInt();
System.out.print("Enterthetimeperiod(inyears):");
doubletime=input.nextDouble();
doubleamount=principal*Math.pow(1+rate/n,n*time);
doublecompoundInterest=amount-principal;
System.out.println("CompoundInterest:"+compoundInterest);
}
}