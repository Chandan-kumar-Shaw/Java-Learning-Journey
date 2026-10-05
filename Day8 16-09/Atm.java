class Atm
{
	public static void main(String args[])
	{
		int pin = 1234;
		int balance = 5000;
		
		int userPin = Integer.parseInt(args[0]);
		int withdrawlAmount = Integer.parseInt(args[1]);
		
		String message = (userPin==pin && withdrawlAmount<=balance)? "Pin Verification Successful And Eligible for WIthdrwal" : "Please Try Again";
		
	
		System.out.println(message);
	
	
	}
}