package StudentDatabase;

public class StudentDatabase {
	
	private String SSN;
	private String name;
	private String email;
	private static int iD = 1000;
	private String userId;
	private double balance = 10000;
	private static double payment = 1000;
	private String phone;
	private String city;
	private String state;
	private String enrolled;
	

	public static void main(String[] args) {
		StudentDatabase stu1 = new StudentDatabase("Cameron Morrow", "159658246");	
			stu1.setPhone("703-548-5896");
			stu1.setCity("Manassas");
			stu1.setState("VA");
			stu1.contactInfo();
			stu1.enroll("Java 101");
			stu1.checkBalance();
			stu1.pay();
			stu1.showCourses();
		
		StudentDatabase stu2 = new StudentDatabase("Rebecca Morrow", "258941234");
			stu1.setPhone("571-555-1486");
			stu1.setCity("Manassas");
			stu1.setState("VA");
			stu1.contactInfo();
			stu1.enroll("Cooking 101");
			stu1.checkBalance();
			stu1.pay();
			stu1.showCourses();
	}
		//Constructor
		public StudentDatabase(String name, String SSN) {
			System.out.println("New student created");
			
			this.SSN = SSN;
			this.name = name;
			setEmail(name);
			setUserId(SSN);
			System.out.println(toString());		
		}
		
		private int setUserId(String SSN) {
			int random = (int) (Math.random() * 10000);
			this.userId = iD + "" + random + SSN.substring(5, 9);
			return iD++;
		}
		
		private void setEmail(String name) {
			this.email = name.toLowerCase() + "." + iD +  "@TheTimSchool.com";

			
		}
		
		//Methods
		public void enroll(String enrolled) {
			System.out.println("\nYou have enrolled in the course " + enrolled);
			this.enrolled = enrolled;
			
		}
		
		public void pay() {
			System.out.println("\nTime to pay the student loan! your payment amount is: $" + payment + " and your new balance is: $" + (balance - payment));
			balance = balance - payment;
		}
		
		public void checkBalance() {
			System.out.println("\nYour balance is: $" + balance);
			
		}
		
		@Override
		public String toString() {
			return "[Name: " + name + " ]\n[Email Address: " + email + "]\n" + "[Student ID:  " + userId + "]";
		}
		
		public void showCourses() {
			System.out.println("\nYou are currently enrolled in: " + enrolled);
		}

		public String getPhone() {
			return phone;
		}

		//methods for defining Encapsulated variables
		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}
		//Method to display the encapsulated variables
		public void contactInfo() {

			System.out.println("\nYour phone number is " + phone + ", your city is " + city + ", and your state is " + state);
		}
		
	}