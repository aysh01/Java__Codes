public class example4 {
	private int value;
	
	public void print() {
		System.out.println("Value: "+this.value);
	}
	
	public void perform() {
		//Pass the current object to another method().
		print();
	}
}
