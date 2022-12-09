package Dec08;

public class Home {

	
	private String name;
	private int ID;

	public Home(String name,int ID) {
		this.name = name;
		this.ID=ID;
	}
	

	public static void main(String[] args) {
		Home home = new Home("Steve Jobs",10000000);
		System.out.println("Coder name is : " + home.name+" and  Salary per day is: "+home.ID);
	
		//Coder name is : Steve Jobs and  Salary per day is: 10000000	
		
	}

}
