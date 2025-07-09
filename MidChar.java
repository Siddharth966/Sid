public class MidChar {
    public static void main(String[] args) {
        String str = "Coding";

        int len = str.length();
        if (len % 2 == 0) {
            System.out.println("Middle characters: " + str.charAt(len/2 - 1) + str.charAt(len/2));
        } else {
            System.out.println("Middle character: " + str.charAt(len/2));
        }
    }
}
