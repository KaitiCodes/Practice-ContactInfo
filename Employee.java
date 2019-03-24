public class Employee {
	//set variables for employee
	private String firstName  ;
	private String lastName   ;
	private String email      ;
	private String phoneNumber;

	//creating constuctor
	public Employee(String first, String last, String e, String phone) {
		firstName   = first;
		lastName    = last;
		email       = e;
		phoneNumber = phone;
	}
	
	//accessors and mutators
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String first) {
		firstName = first;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String last) {
		lastName = last;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String e) {
		email = e;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phone) {
		phoneNumber = phone;
	}

	public void printEmployeeInfo() {
		System.out.println("Employee Name: " + getFirstName() + " " + getLastName() +
				" Employee Email: " + getEmail()  +
				" Employee Phone: " + getPhoneNumber() );
	}
}



