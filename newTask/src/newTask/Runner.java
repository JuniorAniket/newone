package newTask;

public class Runner {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(18);
		list.insert(45);
		list.insert(12);
		list.insertAtStart(88);
		list.insertAt(3,99);
		
		list.deleteAt(2);
		
		list.show();

	}

}
