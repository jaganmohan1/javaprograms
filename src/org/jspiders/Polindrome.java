package org.jspiders;
public class Polindrome {
static int getPolindrome(int n) {
	int res =0;
	while(n !=0) {
		int r = n %10;
		res = res *10 +r;
		n = n /10;
	}
	return res;
}
public static void main(String[] args) {
	int num = 12122;
	int res = getPolindrome(num);
	if(num == res) {
		System.out.println("num is polindrome");
	}else {
		System.out.println("num is not polindrome");
	}
}
}
