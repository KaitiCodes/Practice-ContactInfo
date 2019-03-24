import java.util.*;

public class EmployeeContactInfo {
	

	public static void main(String []args) {
        Employee employee1 = new Employee("Stacy", "Lynn", "test@yahoo.com", "405-894-7942");
        Employee employee2 = new Employee("Bob", "Smith", "testttt@yahoo.com", "283-274-2897");

        ArrayList< Employee > contact = new ArrayList< Employee >();
        contact.add(employee1);
        contact.add(employee2);

        employee1.printEmployeeInfo();
    }



}
