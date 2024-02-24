public class ThreeDice {
    public static int calcScore(String[] sNum, int maxNum){
        int score=0;
        int[] num=new int[3];



        //        change String to int
        for(int i=0;i<num.length;i++){
            num[i]=Integer.parseInt(sNum[i]);
            if(i==0){
                maxNum=num[i];
            }
            else if(maxNum<num[i]){
                maxNum=num[i];
            }
        }

        if((num[0]==num[1]) && (num[0])==num[2]){
            score=((num[0]*1000)+10000);
        }
        else if(num[0]==num[1] || num[0]==num[2] || num[2]==num[1]){
            if(num[0]==num[1]){
                score=(num[0]*100+1000);
            } else if (num[0]==num[2]) {
                score=(num[0]*100+1000);
            }
            else{
                score=(num[1]*100+1000);
            }
        }
        else{
            score=(maxNum*100);
        }

        return score;
    }
}
