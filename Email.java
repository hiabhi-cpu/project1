package projects;
import java.util.Random;
import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department="";
	private String mailId;
	private String passWord="";
	private String altMailId;
	private String company;
	private int mailBoxCapacity;
	
	public Email(String firstName,String lastName,String company){
		this.firstName=firstName;
		this.lastName=lastName;
		this.company=company;
		setDepart();
		createEmail();
		createPassWord();
	}
	
	void setDepart() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the department choice:");
		System.out.println("1.Sales");
		System.out.println("2.Development");
		System.out.println("3.Accounting");
		System.out.println("4.None");
		int x=scanner.nextInt();
		switch(x) {
		case 1:
			department="Sales";
			break;
		case 2:
			department="Development";
			break;
		case 3:
			department="Accounting";
			break;
		default:
			department="";
		}
		scanner.close();
		
	}
	
	void createEmail() {
		mailId=firstName+'.'+lastName+'@'+department+'.'+company+".com";
	}
	
	void createPassWord() {
		Random random=new Random();
		String arr="ABHInnduedf485@$#&";
		int x;
		while(passWord.length()<10) {
			x=random.nextInt(arr.length());
			passWord=passWord+arr.charAt(x);
		}
		System.out.println("Your Password is:"+passWord+"\n");
	}
	
	void changePassWord(String passWord) {
		this.passWord=passWord;
	}
	
	void alterMail(String mailString) {
		altMailId=mailString;
		System.out.println("Alternate Email:"+altMailId+"\n");
	}
	
	void setMailBoxCapacity(int x) {
		mailBoxCapacity=x;
	}
	
	void dispalyDetails() {
		System.out.println("Name:"+firstName+"."+lastName);
		System.out.println("Email:"+mailId);
		System.out.println("Password:"+passWord);
		System.out.println("Mail Box capacity:"+mailBoxCapacity+"Gb");
	}
}
