package palindromeProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeProgram {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Palindrome");
		String palin=br.readLine();
		System.out.println(stringBuilerWay(palin));
		System.out.println(loopingWay(palin));

	}
	
	private static boolean stringBuilerWay(String str) {
		StringBuilder strBuilder= new StringBuilder();
		strBuilder.append(str);
		strBuilder.reverse();
		String strReverse=strBuilder.toString();
		return str.equalsIgnoreCase(strReverse);
		
	}
	
	private static boolean loopingWay(String str) {
		int length=str.length();
		String strReverse="";
		for(int i= length-1;i>=0;i--) {
			strReverse=strReverse+str.charAt(i);
		}
		if(strReverse.equalsIgnoreCase(str)) {
			return true;
		}else {
			return false;
		}
	}

}
