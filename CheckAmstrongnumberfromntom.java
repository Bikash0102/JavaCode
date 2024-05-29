package projectfiles;


public class CheckAmstrongnumberfromntom {
	 public static void main(String[] args) {
	        int a = 1;
	        int b = 1000;
	        for (int i = a; i <= b; i++) {
	            if (isArmstrong(i)) {
	                System.out.println(i);
	            }
	        }
	    }

	    static boolean isArmstrong(int a) {
	        int count = 0;
	        int k = a;
	        int sum = 0;

	        
	        while (a != 0) {
	            a /= 10;
	            count++;
	        }

	        a = k; 
	        while (a != 0) {
	            int l = a % 10;
	            sum += Math.pow(l, count);
	            a /= 10;
	        }

	        return sum == k;
	    }
}

	
		
		
		
	
		
	
	


