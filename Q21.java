// 21.
importjava.util.Scanner;
publicclassProductDiscount{
publicstaticvoidmain(String[]args){
Scannerinput=newScanner(System.in);
System.out.print("Entertheoriginalpriceoftheproduct:");

doubleoriginalPrice=input.nextDouble();
System.out.print("Enterthediscountpercentage:");
doublediscountPercentage=input.nextDouble();
doublediscountAmount=(discountPercentage/100)*originalPrice;
doublediscountedPrice=originalPrice-discountAmount;
System.out.println("DiscountedPrice:"+discountedPrice);
}
}