package AssistedPracticeProjects;

public class innerclassassisted2 {
	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  



	public static void main(String[] args) {
		innerclassassisted2  ob=new innerclassassisted2 ();  
		ob.display();  

		// TODO Auto-generated method stub

	}

}
