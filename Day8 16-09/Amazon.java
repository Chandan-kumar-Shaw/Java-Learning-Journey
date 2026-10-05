class Amazon
{
	public static void main(String args[])
	{
		int minAmount = 500;
		int userAmount = Integer.parseInt(args[0]);
		boolean isPrime = Boolean.parseBoolean(args[1]);
		 
		String message = isPrime ? "Same Day Delivery For Prime Members" : ((userAmount>=minAmount) ? 
		                 "Free Delivery Available" : "Normal Delivery Available") ;
		
		System.out.println(message);
	
	
	
	
	}
}