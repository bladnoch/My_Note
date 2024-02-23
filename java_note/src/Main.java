
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int intMax=0;
        int[] num=new int[3];

//        get input
        String input=sc.nextLine();
        String[] sNum=input.split(" ");

//        change String to int
        for(int i=0;i<num.length;i++){
            num[i]=Integer.parseInt(sNum[i]);
            if(i==0){
                intMax=num[i];
            }
            else if(intMax<num[i]){
                intMax=num[i];
            }
        }

        if((num[0]==num[1]) && (num[0])==num[2]){
            System.out.println((num[0]*1000)+10000);
        }
        else if(num[0]==num[1] || num[0]==num[2] || num[2]==num[1]){
            if(num[0]==num[1]){
                System.out.println(num[0]*100+1000);
            } else if (num[0]==num[2]) {
                System.out.println(num[0]*100+1000);
            }
            else{
                System.out.println(num[1]*100+1000);
            }
        }
        else{
            System.out.println(intMax*100);
        }
    }
}