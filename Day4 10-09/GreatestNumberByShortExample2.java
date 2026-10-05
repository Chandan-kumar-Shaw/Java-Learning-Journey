class GreatestNumberByShort {
    public static void main(String args[]) {

        short a = Short.parseShort(args[0]);
        short b = Short.parseShort(args[1]);

        System.out.println("Greater = " + Math.max(a, b));
    }
}