//Using "this" keyword, to refer inner class & outer class values.
public class example5 {
	private int value=10;
	
	public class inner{
		private int value=25;
		
		public void print() {
			System.out.println("Inner Values: "+this.value); //Refers to inner Class
			
			System.out.println("Outer Values: "+value); //Refers to Outer Class
		}
	}
}
