enum CoffeeSize{SMALL, MEDIUM, LARGE}

class Coffee {
	//enum CoffeeSize{SMALL, MEDIUM, LARGE} -- can be here or at the top

	private CoffeeSize size;
	
	CoffeeSize getSize() {
		return size;
	}
	
	void setSize(CoffeeSize size) {
		this.size = size;
	}
	
	public static void main(String ... args) {
		Coffee coffee = new Coffee();
		coffee.setSize(CoffeeSize.SMALL);
		System.out.println(coffee.getSize());
	}
}