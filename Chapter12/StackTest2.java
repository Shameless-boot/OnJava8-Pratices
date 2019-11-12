public class StackTest2{
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();

		for (String str : "My dog has fleas".split(" "))
			stack.push(str);

		while(!stack.isEmpty()) 
			System.out.print(stack.pop() + " ");
	}
}