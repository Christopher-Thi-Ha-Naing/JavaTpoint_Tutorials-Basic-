package factorialNumber;

public class FactorialProgram {
	public static void main(String[] args) {
		System.out.println(loopingWay(5));
		System.out.println(recursiveWay(5));
	}
	
	private static int loopingWay(int num) {
		int sum=1;
		for(int i=num;i>0;i--) {
			sum*=i;
		}
		return sum;
	}
	
	private static int recursiveWay(int num) {
		if(num<=0) {
			return 1;
		}
		return num*recursiveWay(num-1);
	}

}
