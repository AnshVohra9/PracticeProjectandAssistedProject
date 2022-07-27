package PracticeProjects;

import java.util.Scanner;

public class emailverification {

	public static void main(String[] args) {
		String emailid[]= {"ansh.vohra4545@gmail.com","ansh.vohra4247@gmail.com","ansh.vohra5457@gmail.com","ansh.vohra7720@gmail.com"};
		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.println("enter mail id");
			String id=sc.next();
			int count=0;
			System.out.println("verifying");
			for (int i=0; i<emailid.length;i++) {
				if(id.equals(emailid[i])) {
					count=1;
					break;
				}
			}
			if(count==1) {
				System.out.println("Found!");
		}
			else{
				System.out.println("Not Found!!!!");
	
			}
		}
		// TODO Auto-generated method stub

	}

}
