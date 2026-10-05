class AddTwoNumber
{
	public static void main(String args[])
 {
	 int fisrtNumber = Integer.parseInt(args[0]);
	 int secoundNumber = Integer.parseInt(args[1]);
	 
      int finalResult = AddTwoNumber.doSum(fisrtNumber, secoundNumber);
	  System.out.println("The sum of two number :" + finalResult);
   
 }
    static int doSum(int fisrtNumber, int secoundNumber )
	{
	 int sum = fisrtNumber + secoundNumber;
	return sum;
	}
}