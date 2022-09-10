package primaryKey;

public class PrimaryKey {

	public static void main(String[] args) {
		System.out.println(loopingWay(117589));
		System.out.println(recursiveWay(117589));
		System.out.println(isPrime(117589));
		System.out.println(isPrimeModernWay(117589));

	}
	
	private static boolean loopingWay(int num) {
		  if (num < 2) {
		      return false;
		    } else {
		      int nSquared = (int)Math.sqrt(num) + 1;
		      for (int i = 2; i < nSquared; i++){
		        if (num % i == 0){
		          return false;
		        }
		      }
		    }
		    return true;	
	}
	
	static int i =2;
	private static boolean recursiveWay(int num) {
		if(num > 1) {
			if(num == 2) {
				return true;
			}else if(num%i == 0 && i==num){
				return true;
			}else if(num%i == 0 && i!=num){
				return false;
			}else {
				i++;
				return recursiveWay(num);
			}
		}else {
			return false;
		}
	}
	
	public static int j=1;
	public static boolean isPrime(int num) {
	    return num > 1 ? num == 2 ? true : num%j == 0 && j==num ? true : num%j == 0 && j!=num ? false : isPrime(num) : false;
	 }
	
	public static boolean isPrimeModernWay(int num) {
	    return num > 1 && java.math.BigInteger.valueOf(num).isProbablePrime(80);
	  }
}
