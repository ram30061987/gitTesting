package mypack;

public class RightRotateByTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7};
		int p=2;
		rightRotate(a,p);
		printArrayAfterRotate(a);

	}

	private static void printArrayAfterRotate(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
	}

	public static void rightRotate(int[] a, int p) {
		// TODO Auto-generated method stub
		for(int i=0;i<p;i++) {
			rightRotate(a);
		}
		
	}

	public static void rightRotate(int[] a) {
		// TODO Auto-generated method stub
		int temp;
		int i;
		temp=a[a.length-1];
		for( i=0;i<a.length-1;i++) {	
			a[i+1]=a[i];
		}
		a[i]=temp;
	}

	
}
