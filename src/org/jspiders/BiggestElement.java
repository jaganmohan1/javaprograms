package org.jspiders;

import java.util.Scanner;

public class BiggestElement {
 static int getBiggest(int arr[]) {
	 
	 int big = arr[0];
	 for(int i=1; i<arr.length; i++) {
		 if(arr[i]>big) {
			 return big = arr[i];
		 }
	 }
	return big;
	 
 }
 
 public static void main(String[] args) {
	int arr[] = {21, 323,454, 6565, 767,6};
	int b = getBiggest(arr);
	System.out.println(b);
}
}
