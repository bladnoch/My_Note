import java.util.ArrayList;

public class ValidParentheses {
    public static boolean isValid(String s){
        String[] parenteses=s.split("");
        ArrayList<Integer> left=new ArrayList<>();

//        if 왼쪽 기호중 하나면
//        왼쪽 기호 저장
//        왼쪽과 오른쪽 매칭 해서 비교
//        매칭되면 다음 왼쪽으로 이동 후 다시 비교
//        다르면 return false

        int count=0;


        for (int i =0;i<parenteses.length;i++){

            System.out.println("count: "+count);
            count++;

            if(parenteses[i].equals("[") || parenteses[i].equals("{") || parenteses[i].equals("(")){
                left.add(i);
            } else if (left.isEmpty() && (parenteses[i].equals("]") || parenteses[i].equals("}") || parenteses[i].equals(")"))) {
                return false;
            } else if (parenteses[i].equals("]") && parenteses[left.get(left.size()-1)].equals("[")) {
                left.remove(left.size()-1);
            }else if (parenteses[i].equals("}") && parenteses[left.get(left.size()-1)].equals("{")) {
                left.remove(left.size()-1);
            }else if (parenteses[i].equals(")") && parenteses[left.get(left.size()-1)].equals("(")) {
                left.remove(left.size()-1);
            }else{
                return false;

            }

//            System.out.println("작업중인 parenteses: "+parenteses[i]+"\n저장된 parenteses: "+parenteses[left.get(left.size()-1)]);
//            System.out.println(left);

        }
        System.out.println(left);
        if(!left.isEmpty()) return false;

        return true;
    }
}
