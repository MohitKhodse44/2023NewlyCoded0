

class Main4 extends Tree
{
	public void generateOxygen()
	{
		System.out.println("Tulsi tree generate max % of oxygen");
	}
	public static void main(String[] args) {
		System.out.println("main method");
		
		Tree c = new Tree();
		c.generateOxygen();
		
	}
}

class Tree
{
   public void generateOxygen() {
		
    	System.out.println("Tree are good generator of oxygen");
	}
}

