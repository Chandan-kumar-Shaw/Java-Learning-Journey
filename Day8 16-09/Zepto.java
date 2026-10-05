class Zepto
{
	public static void main(String args[])
	{
		int amount = 500;
		
        int orderValue = Integer.parseInt(args[0]);
        boolean isPrimeUser = Boolean.parseBoolean(args[1]);
        int transactionAmount = Integer.parseInt(args[2]);

        
        String deliveryMessage = orderValue > amount ? "Free Delivery" : "Delivery Charges Applicable";
                System.out.println(deliveryMessage);


        
        String sameDay = isPrimeUser ? "Same Day Delivery" : "Normal Delivery";
                
        System.out.println(sameDay);        


         int txnCharges = transactionAmount > 2000 ? transactionAmount * 3 / 100 : 0;

        System.out.println("Transaction Charge: " + txnCharges);
    
	
	
	
	}
}