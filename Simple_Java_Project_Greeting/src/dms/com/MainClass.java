package dms.com;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter your name");
       String name = sc.next();
       Employee emp = new Employee(name);
       emp.greet(emp.name);
}

}
