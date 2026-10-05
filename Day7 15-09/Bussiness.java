class Bussiness
{
	int costPrice = 2000;
	static int sellingPrice = 3000;
	


	public static void main(String args[])
	{
	 Bussiness bs = new Bussiness();
	   int cP = bs.costPrice;
	 int profit = (sellingPrice - cP);
	 System.out.println("Profit after selling :" + profit);
	
	bs.main();
	
	}

     void main()
	 {
		 
	System.out.println("This is main method 2");	 
	 }
}