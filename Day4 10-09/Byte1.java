 class ByteExample1 {
    public static void main(String args[]) {

        byte a = Byte.parseByte(args[0]);
        byte b = Byte.parseByte(args[1]);

        System.out.println("Sum = " + (a + b));
    }
}