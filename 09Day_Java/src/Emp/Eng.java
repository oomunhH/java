package Emp;
public class Eng extends Emp {

	String skill;

	@Override
	public String toString() {
		return "Eng [skill=" + skill + name+"]";
	}

	public Eng() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Eng(String name, String skill) {
		super(name);
		this.skill = skill;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public String printInfo() {
		// TODO Auto-generated method stub
		return super.printInfo()+"\t"+skill;
	}
	
	
}
