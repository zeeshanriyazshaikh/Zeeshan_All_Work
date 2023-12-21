
public class SubstringExample {

    public static void main(String[] args) {

        String originalString = "zEEshan";

        // Using substring(startIndex)

        String substring1 = originalString.substring(3);
        String substring1Upper=substring1.toUpperCase();
        System.out.println(substring1Upper);

        String substring2 = originalString.substring(1, 3);
        String substring2Lower=substring2.toLowerCase();
        System.out.println(substring2Lower);

        String substring3 = originalString.substring(0,1);
        String substring3FirstLetter=substring3.toUpperCase();
        System.out.println(substring3FirstLetter);

        System.out.println(substring3FirstLetter+substring2Lower+substring1Upper);



    }

}
