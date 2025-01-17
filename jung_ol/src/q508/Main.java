package q508;

public class Main {
	public static void main(String[] args) {
		Object[] item = { "item", "pen", "note", "eraser" };
		Object[] count = { "count", 20, 5, 110 };
		Object[] price = { "price", 100, 95, 97 };
		for (int i = 0; i < 4; i++) {
			System.out.printf("%10s%10s%10s\n", item[i], count[i], price[i]);
		}
	}
}
