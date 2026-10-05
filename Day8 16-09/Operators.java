class operators
{
	public static void main(String args[])
	{
		int minAge = 18;// assignment operator used
		int userAge = Integer.parseInt(args[1]);// "22" ---> 22
		String name = args[0];
		System.out.println("Applying DL for : " + name);
		System.out.println("Allowed to apply for DL : " + (minAge<userAge)) ;// true
	
	
	
	}

}

/* if we provide 22years as args[0] as parameter of userAge we will get java.lang.Number Format Exception.
      for input string "22years" */