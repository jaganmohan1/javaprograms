package org.jspiders;

public class CountPrimeNumbers {
 static boolean isPrime(int a ) {
	 boolean status = false;
	 for(int i=2; i<=a/2; i++) {
		 if(a%i==0) {
			 status = false;
		 }else {
			 status =true;
		 }
	 }
	 
	 return status;
 }
 static int PrimeCount(int arr[]) {
	 int pc =0;
	 for(int i=0; i<arr.length; i++) {
		 if(isPrime(i)) {
			 pc++;
		 }
	 }
	 
	 return pc;
 }
 public static void main(String[] args) {
	int arr[] = {21,32,443,11,22,33,444,5,5,55,};
	System.out.println(PrimeCount(arr));
}
}
