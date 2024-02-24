public class PalindromeNumber {
    public static boolean getTF(int x){

        String xStr=String.valueOf(x);
        int len=xStr.length();
        String[] arrStr=xStr.split("");

        boolean tf;

        for (int i=0;i<len/2;i++){
            if(arrStr[i].equals(arrStr[len-i-1])){

            }
            else {
                return false;
            }
        }
        return true;
    }
}
