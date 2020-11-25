package Abstract1;

import Abstract1.Date;

public class Person {
	private String name;
	private Date bdate;
	
	public Person() {
		super();
		name="";
		bdate=new Date();
	}

	public Person(String name, int dd,int mm,int yy) {
		super();
		this.name = name;
		this.bdate = new Date(dd,mm,yy);
	}
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Birthdate : ");
		bdate.showDate();
	}


	@Override
	public String toString()
	{
		return "Person [name=" + name + ", bdate=" + bdate + "]";
	}
	
	

}