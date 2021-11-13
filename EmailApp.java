package projects;
public class EmailApp {

	public static void main(String[] args) {
		Email e1=new Email("Abhishek", "Kalasaraddi", "XYZ");
		e1.changePassWord("sd*%kdsq");
		e1.alterMail("abhi5004@gmail.com");
		e1.setMailBoxCapacity(100);
		e1.dispalyDetails();
		
		
	}

}
