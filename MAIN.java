package NonLinear;
import java.util.Scanner;
public class MAIN {

	public static void main(String[]args) {
		BST b1=new BST();
		b1.insert(10);
		b1.insert(20);
		b1.insert(15);
		b1.insert(27);
		b1.insert(13);
		b1.insert(9);
		b1.insert(3);
		b1.insert(5);
		b1.insert(8);
		b1.inorder();
	}
}
