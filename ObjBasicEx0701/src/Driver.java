public class Driver {

	public static void main(String[] args) {
		Product.displayStoreName();
		
		Product keyboard = new Product("キーボード", 4000);
		Product mouth = new Product("マウス");
		
		keyboard.display();
		mouth.display();
		
		keyboard.down();
		mouth.up(2000);
		
		System.out.println("---価格再設定後---");
		keyboard.display();
		mouth.display();
	
	}

}
