package in.balamt.practice.exception.suppressedexceptions;

import in.balamt.practice.util.JavaPracticeUtils;

public class SuppressedExceptionsApp {
	
	public static void main(String[] args) {
		
		try(SuppressedResource sr = new SuppressedResource();){
			sr.readFromresource();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			int index = 1;
			JavaPracticeUtils.printLine(index + "\t" + e.getMessage());
			Throwable[] supExe = e.getSuppressed();
			
			for(Throwable t : supExe) {
				JavaPracticeUtils.printLine((++index) + "\t" + t.getMessage());
			}
		}
		
	}

}
