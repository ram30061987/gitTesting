package mypack;


public class ConcateStringComma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] supportedPhones = {"1", "2", "3"}; 
		String models = String.join("+", supportedPhones);
		System.out.println(models);
		


	}

}
