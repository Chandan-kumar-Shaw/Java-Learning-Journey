class SubstractExample{
public static void main(String args[]){

String firstNumber = args[0];
String secondNumber = args[1];
byte firstNumberByte = Byte.parseByte(firstNumber);
byte secondNumberByte = Byte.parseByte(secondNumber);

System.out.println(firstNumberByte-secondNumberByte);
}
}