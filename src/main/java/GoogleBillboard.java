

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public static void main(final String[] args) {
		for(int i = 2; i < e.length(); i++){
			if (isPrime(Long.parseLong(e.substring(i, i+10))) == true){
				System.out.println(Long.parseLong(e.substring(i, i+10))); //prints when it finds a prime #
				break;
  			}
		}
	}
	
  public static boolean isPrime(long x){
	if (x <= 1) {
      		return false;
    	  }

  	int factors = 0;

  	for (int i = 1; i <= Math.sqrt(x); i++) {
    		if (x % i == 0) {
      			factors++;

      			if (factors > 1) {
        			return false;
      			}
    		}
	}
	  
  	return true;
  }
// ^^^ isPrime func ^^^

}
