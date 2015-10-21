enum BurgerSize {
	SMALL,
	MEDIUM,
	LARGE {
		public int getBoxSize() {
			return 20;
		}
	};
	
	
	public int getBoxSize() {
		return 10;
	}
}

public class Burger {
	public static void main(String ... args) {
		BurgerSize smallBurger = BurgerSize.SMALL;
		BurgerSize largeBurger = BurgerSize.LARGE;
		
		System.out.println("Size: " + smallBurger + " box size " + smallBurger.getBoxSize());
		System.out.println("Size: " + largeBurger + " box size " + largeBurger.getBoxSize());
	}
}