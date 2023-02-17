 package in.balamt.practice.main;

public class StaticMethodAndClassApp {
/**
 * Output:
  	InnerStatic Method Return
	Calling the usual way
	Hello this is one way of calling innser non-static method
	InnerStatic Method Return

 * @param args
 */
	public static void main(String[] args) {

		//Calling the InnerStaticClass and the InnerStaticMethod inside it.
		System.out.println(StaticInnerClass.InnerStaticMethod());
		
		//Generic way of creating object and calling the non-static method
		StaticInnerClass staticInnerClass = new StaticInnerClass();
		staticInnerClass.InnerStaticMethod("Calling the usual way");
		
		try {
			//We can invoke without creating object, but use the newInstance method of class.
			StaticInnerClass.class.newInstance().InnerStaticMethod("Hello this is one way of calling innser non-static method");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Invoking the Static method with the instance of StaticInnerClass
		System.out.println(staticInnerClass.InnerStaticMethod());
	}

	/**
	 * Static Inner Class
	 * @author balam
	 *
	 */
	public static class StaticInnerClass{
		public static String InnerStaticMethod() {
			return "InnerStatic Method Return";
		}
		
		/**
		 * Cannot have same name for non-static method
		 * If you un-comment it will give compile time error.
		 * Duplicate method InnerStaticMethod() in type StaticMethodAndClassApp.StaticInnerClass
		 * 
			public String InnerStaticMethod() {			}
		**/
		
		/**
		 * Non-static method, with same name but accepts argument.
		 * meaning signature is different from the static method. 
		 * @param msg
		 */
		public void InnerStaticMethod(String msg){
			System.out.println(msg);
		}
	}
}
