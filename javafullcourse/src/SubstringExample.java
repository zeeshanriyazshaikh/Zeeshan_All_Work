
public class SubstringExample {

    public static void main(String[] args) {
//TOGGLE STRING USING SUBSTRING
        
        String str = "zEEshan";
        String str1=str.substring(0,1).toUpperCase(); // output = Z [start index 0 i.e. z and end index 1 i.e. E]
        System.out.println(str1);

        String str2=str.substring(1,3).toLowerCase();// output = ee [start index 1 i.e. first E and end index 3 i.e. s]
        System.out.println(str2);

        String str3=str.substring(3).toUpperCase();// output = SHAN [start index 3 i.e. s and end index till last]
        System.out.println(str3);
        System.out.println(str1+str2+str3); // output == ZeeSHAN

    }

}
