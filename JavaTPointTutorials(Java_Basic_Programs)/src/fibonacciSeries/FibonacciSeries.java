package fibonacciSeries;

public class FibonacciSeries {
	public static void main(String[] args) {
		loopingWay(10);
		recursiveWay(10);
		
	}
	
	static int j=0,k=-1,l=1;
	private static void recursiveWay(int num) {
		if(num>=0) {
			j=k+l;
			System.out.print(j+", ");
			k=l;
			l=j;
			recursiveWay(num-1);
		}			
	}
	
	private static void loopingWay(int num) {
		int j=0;
		int k=-1;
		int l=1;
		for(int i=0;i<=num;i++) {
			j=k+l;
			System.out.print(j+", ");
			k=l;
			l=j;
		}
	}

}
