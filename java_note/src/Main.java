
import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        //main here



//        ValidParentheses
//        String input="]";
//        System.out.println(ValidParentheses.isValid(input));


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


    //        ThreeDice
    public static int getScore(){
        int intMax=0;
        int[] num=new int[3];

//        get input
        String input=sc.nextLine();
        String[] sNum=input.split(" ");

        return ThreeDice.calcScore(sNum,intMax);
    }
}