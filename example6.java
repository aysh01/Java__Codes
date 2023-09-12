//Design of Accessors & Mutators Methods
public class example6 {
	static int age;
	String name;
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public static void main(String [] args) {
		if(age>=0 && age <=150) {
			age=age;
		} else {
			throw new IllegalArgumentException("Invalid Exception");
		}
	}
}
