class CheckEvenOddByByte {
    public static void main(String args[]) {

        byte n = Byte.parseByte(args[0]);

        if (n > 0)
            System.out.println("Positive");
        else if (n < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
}