class multiplications {
public static void main(String args[]){

String firstNum = args[0];
String secondNum = args[1];

short firstNumShort = Short.parseShort(firstNum);
short secondNumShort = Short.parseShort(secondNum);
System.out.println(firstNumShort * secondNumShort);
}
}