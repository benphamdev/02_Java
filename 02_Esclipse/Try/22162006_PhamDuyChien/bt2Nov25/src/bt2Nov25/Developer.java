package bt2Nov25;

public class Developer extends Employee implements ICode {
	private Coder coderPart;

	public Developer(String name) {
		super(name);
		coderPart = new Coder();
	}

	public void performDuties() {
		coderPart.writeCode();
	}

	@Override
	public void writeCode() {
		// TODO Auto-generated method stub
		coderPart.writeCode();
	}

}
