package prob04;

public class Depart extends Employee{
	
	private String department;
	
	public Depart(String name, int sal, String dept) {
		super(name, sal);
		this.department=dept;
	}
	
	@Override
	public void getInformation() {
		System.out.println( "이름:" + getName() + "연봉:" + getSalary() + "부서:" + department );
	}
	

}
