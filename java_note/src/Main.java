
import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int x=900;
        String xStr=String.valueOf(x);
        int len=xStr.length();
        String[] arrStr=xStr.split("");

        boolean tf;
        for (int i=0;i<len;i++){
            System.out.println(arrStr[i]);
        }

        for (int i=0;i<len/2;i++){
            if(arrStr[i].equals(arrStr[len-i-1])){

            }
            else {
                return false;
            }
        }
        return true;



//        for (int i=0;i<len/2;i++){
//            if()
//        }





//        ThreeDice
//        System.out.println(getScore());

//        RomanToInteger
//        System.out.println(RomanToInteger.romanInteger(sc.nextLine()));
    }



    public static int getScore(){
        int intMax=0;
        int[] num=new int[3];

//        get input
        String input=sc.nextLine();
        String[] sNum=input.split(" ");

        return ThreeDice.calcScore(sNum,intMax);
    }
}