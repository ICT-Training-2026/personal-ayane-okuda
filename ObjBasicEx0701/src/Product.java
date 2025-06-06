
public class Product {
	static final String STORE_NAME = "速水PC販売店";
	static int DEFAULT_CHANGE_AMT = 1000;
	String name;
	int price;
	
	Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	Product(String name){
		this(name, 0);
	}
	

	//---------------------------
	
	static void displayStoreName() {
		System.out.println("■店舗名:" + STORE_NAME);
	}
	
	int up(int amt) {
		return price += amt;
	}
	
	int up() {
		return this.up(DEFAULT_CHANGE_AMT);
	}
	
	int down(int amt) {
		return price -= amt;
	}
	
	int down() {
		return this.down(DEFAULT_CHANGE_AMT);
	}
	
	void display() {
		System.out.println(name + ":" + price + "円");
	}
	
}
