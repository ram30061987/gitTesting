package stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack nums=new Stack();
		System.out.println("before empty method "+nums.isEmpty());

		nums.push(5);
		nums.push(12);
		nums.push(18);
		nums.pop();
		System.out.println(nums.peek());
		System.out.println("size is "+nums.size());
		System.out.println("after empty method "+nums.isEmpty());

		nums.show();
		
	}

}
