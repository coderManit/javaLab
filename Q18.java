// 18.
publicclassFibonacciSeries{
publicstaticvoidmain(String[]args){
intn=10;//Numberoftermsintheseries
intfirstTerm=0,secondTerm=1;
System.out.println("FibonacciSeries:");
for(inti=1;i<=n;i++){
System.out.print(firstTerm+"");
intnextTerm=firstTerm+secondTerm;
firstTerm=secondTerm;
secondTerm=nextTerm;
}
}
}