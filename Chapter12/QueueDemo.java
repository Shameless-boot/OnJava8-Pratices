import java.util.*;

class QueueDemo {
	public static void printQ(Queue queue) {
		while(queue.peek() != null)
			System.out.print(queue.remove() + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();

		Random rand = new Random();
		for (int i = 0; i < 10; i++)
			queue.offer(rand.nextInt(i + 10));
		printQ(queue);

		Queue<Character> qc = new LinkedList<>();

		for(char c : "Bronstkaj".toCharArray())
			qc.offer(c);

		printQ(qc);
	}
}