public class SimpleInterest
{
	public static void main(String args[]){

		float principal = Float.parseFloat(args[0]);
		float rate = Float.parseFloat(args[1]);
		int time = Integer.parseInt(args[2]);
 
        float interest = (principal*rate*time)/100;
        System.out.println("SimpleInterest =" + interest);
		float totalAmount = principal + interest;
		System.out.println("Toatl Amount =" +totalAmount);
		



}
}
