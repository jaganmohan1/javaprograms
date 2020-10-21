package org.jspiders;

public class ArmStrongNum {
static int getArms(int num) {
	int n =0;
	while(num != 0) {
		int r = num%10;
		n = n+(r*r*r);
		num = num/10;
		
	}
	return n;
}
public static void main(String[] args) {
  int n = 153;
  int res = getArms(n);
  System.out.println(res);
  if(n == res) {
	  System.out.println(" num  is arms");
	  
  }else {
	  System.out.println("num is  not arms");
  }
}
}
