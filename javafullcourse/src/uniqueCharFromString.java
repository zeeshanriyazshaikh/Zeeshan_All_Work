public class Main {
    public static void main(String[] args) {
        String str = "zeeshanshaikh";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            if (count == 1) {
                // print with spaces
                System.out.print(ch + " ");
            }
        }
    }
}
