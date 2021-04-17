package mypack;

class ExceptionDemo {
	public static void main(String[] arg) {
		int a = 10;
		try {
			int x = a / 0;
		} catch (Exception e) {
			System.out.println("caught ..");
//return ; //1.
			System.exit(0); // 2
		} finally {
			System.out.println("finally ..");
		}
	}
}