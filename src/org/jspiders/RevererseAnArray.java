package org.jspiders;

import java.util.Scanner;

public class RevererseAnArray {
 static int[] redArray() {
	 int n =0;
	 System.out.println("enter the size of the array:");
	 Scanner sc = new Scanner (System.in);
	 n = sc.nextInt();
	 int arr[] = new int[n];
	 System.out.println("enter the element's  into the array:");
	 for(int i=0; i<n; i++) {
		 arr[i] = sc.nextInt();
		 
	 }
	 return arr;
 }
 static void display(int arr[]) {
	 System.out.println("displaying the element's are :");
	 for(int i=0; i<arr.length; i++) {
		 System.out.print(" "+arr[i]);
	 }
	 
 }
 static void reverse(int arr[]) {
	 for(int i=0; i<arr.length/2; i++) {
		 int t = arr[i];
		 arr[i] = arr[arr.length-1-i];
		 arr[arr.length-1-i]=t;
	 }
	 
 }
 public static void main(String[] args) {
	int arr[] =redArray();
	display(arr);
	reverse(arr);
	display(arr);
	
}
 
}
