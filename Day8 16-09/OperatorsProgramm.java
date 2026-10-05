class OperatorsProgramm
{
	public static void main(String args[])
	{
		int minAge = 18;
		int maxAge = 60;
		
		int userAge = Integer.parseInt(args[1]);
		String name = args[0];
		System.out.println("Applying DL for : " + name);
		
		System.out.println("Condition1 :" + (minAge<userAge));
		System.out.println("Condition1 :" + (maxAge>userAge));
		
		System.out.println("Allowed to apply for DL :" + ((minAge<userAge)&& (maxAge>userAge)));
	
		String message = minAge < userAge ? "Allowed" : "NotAllowed";
		System.out.println(message);
	
	
	
	}

}