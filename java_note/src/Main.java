
import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

//        ValidParentheses


//        LongestCommonPrefix(not completed)
//        String[] strs = {"flower","flow","flight"};
//        String[] strs_2 = {"dog","racecar","car"};
//        System.out.println(LongestCommonPrefix.solution(strs));
//        System.out.println(LongestCommonPrefix.solution(strs_2));

//        ThreeDice
//        System.out.println(getScore());

//        RomanToInteger
//        System.out.println(RomanToInteger.romanInteger(sc.nextLine()));

//        PalinfromeNumber
//        System.out.println(PalindromeNumber.getTF(sc.nextInt()));
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