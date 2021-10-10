package in.balamt.practice.logical;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class CountingHikesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = countingValleys(8,"UDDDUDUU");
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
