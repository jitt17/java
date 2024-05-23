package employeData;

public class demoEmployee {
	public static void main(String[] args) {
		//obj of empinfo
		emplyoePersonalInfo emp = new emplyoePersonalInfo();
		System.out.println("Defualt Constructor "+emp);// call defult constructor 
		
		System.out.println();
		
		emp.setEname("Jitendra");
		emp.setEmail("Jitendra123@gmail.com");
		emp.setAdd("Ahmedabad");
		emp.setPhoneNumber(598587647);
		
		System.out.println("Static Value "+emp); // with the help of tostring fun in empinfo
	
		System.out.println();
		
		emplyoePersonalInfo empPeramiter = new emplyoePersonalInfo("Jitendra","Jitendra123@gmail.com","gj",598587647);
		System.out.println("Peramiter Constructor "+empPeramiter);
	}
}
