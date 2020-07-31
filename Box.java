
public class Box {
	public int size = 0;

	public void printBox() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

public void printBox(char c) {
		for (int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.print(c);
			}
			System.out.println();
			
			}
	}

public static void main (String[] args) {
		Box myBox = new Box();
		myBox.size = 5;
		myBox.printBox();
		
		System.out.println("Overloaded method, char as c\n");
		myBox.printBox('c');
	}
}