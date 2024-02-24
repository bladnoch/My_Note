public class RomanToInteger {
    public static int romanInteger(String s){


        int totalNum=0;
        int temp=0;

        String[] roman=s.split("");
        int[] nums=new int[roman.length];

        for (int i=0;i<roman.length;i++){
            if(roman[i].equals("I")){
                nums[i]=1;
            } else if (roman[i].equals("V")) {
                nums[i]=5;
            }else if (roman[i].equals("X")) {
                nums[i]=10;
            }else if (roman[i].equals("L")) {
                nums[i]=50;
            }else if (roman[i].equals("C")) {
                nums[i]=100;
            }else if (roman[i].equals("D")) {
                nums[i]=500;
            }else {
                nums[i]=1000;
            }
//            System.out.println(roman[i]);
//            System.out.println(nums[i]);
        }

        if (nums.length==1){
            return nums[0];
        }

        for (int i = 0; i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                totalNum+=temp;
                temp=0;
                totalNum+=nums[i];
                if(i==nums.length-2){
                    totalNum+=nums[i+1];
                }
//                System.out.println("1");
            }
            else if(nums[i]<nums[i+1]){
                totalNum+=temp;
                temp=0;
                totalNum-=nums[i];
                if(i==nums.length-2){
                    totalNum+=nums[i+1];
                }
//                System.out.println("2");
            }
            else if(nums[i]==nums[i+1]){
                temp+=nums[i];
                if(i==nums.length-2){
                    temp+=nums[i+1];
                }
//                System.out.println("3");
            }
        }
        if(temp!=0){
            totalNum+=temp;
        }

        return totalNum;

    }
}
