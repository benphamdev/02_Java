package bt1Nov25;

public class Developer extends Employee {

	protected Developer(String name) {
		super(name);
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " is writing code.");
	}

}
