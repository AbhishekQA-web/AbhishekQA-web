package com.actitime.scripts;

public class TestingQA {

	public static void main(String[] args) {
	
		String str = "My name is ABhishek";
		String [] strarr = str.split(" ");
		String str1 = "";
		
		for (int i = 0; i <=strarr.length; i++) {
			System.out.println(strarr[i]+ "");
		}
		System.out.println();
		for (int j = strarr.length-1; j >=0; j--) {
			str1 = str1 + strarr + "";
		}
		System.out.println(str1);

	}

}
