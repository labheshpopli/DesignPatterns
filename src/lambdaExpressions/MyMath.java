package lambdaExpressions;

public class MyMath {
	 public static boolean checker(PerformOperation p, int num) {
		  return p.check(num);
	 }	  
	
	PerformOperation isOdd(){
	    return (i -> (i % 2 == 0)?false:true);
	}
	
	PerformOperation isPrime(){
	    return (i -> {
	    	for(int j = 2; j < i/2; j++) {
	    		if(i%j == 0)
	    			return false;
	    	}
	    	return true;
	    } );
	}
	
	PerformOperation isPalindrome(){
		return number -> (String.valueOf(number).equals(new StringBuilder(String.valueOf(number)).reverse().toString()))?true:false;
	}
}