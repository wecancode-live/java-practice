package in.balamt.practice.logical;

public class CountingHikesApp {

	public static void main(String[] args) {
		int result = countingValleys(2,"UDDDUDUUDU");
		System.out.println("Result  " + result);

	}
	
	// Complete the countingValleys function below.
    static int countingValleys(int n, String s) {

    	int level = 0;
    	int valley = 0;
    	char[] steps = s.toCharArray();
    	
    	for(char c : steps) {
    		if( c == 'U')
    			level++;
    		if(c == 'D')
    			level--;
    		
    		if(level == 0 && c == 'U') {
    			valley++;
    		}
    	}
    	
    	return valley;

    }
	

}
