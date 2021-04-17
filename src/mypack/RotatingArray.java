package mypack;

public class RotatingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int p = 2;
		//rotate(a, p, a.length);
		rightRotateByTwo(a,a.length);
		printArray(a);
	}

	private static void printArray(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
		
	}

	public static void rotate(int a[], int position, int length) {
		for (int i = 0; i < position; i++) {
			leftRotateByTwo(a, length);
		}

	}

	public static void leftRotateByTwo(int[] a, int length) {
		// TODO Auto-generated method stub
		int temp;
		temp = a[0];
		int i;
		for (i = 0; i < length - 1; i++) {
			a[i] = a[i + 1];
		}
		a[i] = temp;
	}
	
	
	public static void rightRotateByTwo(int[] a, int length) {
		// TODO Auto-generated method stub
		int count=0;
		int temp;
		temp = a[a.length-1];
		int i;
		for (i = length-1; i > 0; i--) {
			a[i] = a[i-1];
		}
		a[0] = temp;
		count++;
	}
	
	
}
