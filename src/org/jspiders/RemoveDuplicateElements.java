package org.jspiders;

public class RemoveDuplicateElements {
  static int []	 getUnique(int arr[]) {
	  int temp [] = new int[arr.length];
	  for(int i=0; i<arr.length; i++) {
		  if(arr[i] != arr[i+1]) {
			  temp[i] = arr[i];
			  
		  }
	  }
	  return temp;
  }
	public static void main(String[] args) {
		
	}
}
