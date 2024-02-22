import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> three_dice= new ArrayList<Integer>(3);
        for(int i=0;i<3;i++){
            three_dice.add((int)(Math.random()*6)+1);
            System.out.println(three_dice.get(i));
        }
        if((three_dice.get(0)==three_dice.get(1)) && (three_dice.get(0)==three_dice.get(2))){
            System.out.println(three_dice.get(0)+(10000*1000));
        }
        if(three_dice.get(0)==three_dice.get(1));





    }
}