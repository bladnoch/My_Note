
import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(getScore());

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