package utility;

public class ReverseString {
    public static void main(String[] args) {
        String r = "Java";
        String result = "";
        for (int i = r.length()-1; i>=0;i--){
            char ch = r.charAt(i);
            result+=ch;
        }
        System.out.println(result);
    }
}
