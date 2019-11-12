import java.util.*;

class StackTest{
	public static void main(String[] args) {

		Deque<String> stack = new ArrayDeque<>();

		for(String str : "My dog has fleas".split(" "))
			stack.push(str);

		while(!stack.isEmpty()) 
			System.out.print(stack.pop() + " ");
	}
}