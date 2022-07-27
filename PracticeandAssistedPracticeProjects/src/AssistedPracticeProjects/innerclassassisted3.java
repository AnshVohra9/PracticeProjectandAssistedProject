package AssistedPracticeProjects;
abstract class AnonymousInnerClass {
	   public abstract void display();
	}


public class innerclassassisted3 {

	public static void main(String[] args) {
		AnonymousInnerClass i = new AnonymousInnerClass() {

	         public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      i.display();

		// TODO Auto-generated method stub

	}

}
