class FundTransfer
{
	public static void main(String args[])
	{
	    System.out.println("Starting main()");
		
		boolean result = FundTransfer.doTranscation(10,"987654321", "123456789");
		System.out.println("Is txn successful ?" + result);
		
		System.out.println("Ending main()");
	}

	static boolean doTranscation(int amountToBetxn, String senderAccNo, String receiverAccNo)
	{
		System.out.println("Entered Transcation");
	
		System.out.println(" Input Received " + amountToBetxn + " " + senderAccNo + " " + receiverAccNo );
		
		System.out.println("Exited Transcation");
		
		return true;
	
	}

}
/* SOLID Principle do some research, S- stand for Single Responsibility 
     means one class will perform one Functionality that is FundTransfer here */
  