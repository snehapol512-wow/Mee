package Assignment4;
import java.util.*;

    public class Permutations {

        static void permute(List<Integer> list,int l){
            if(l==list.size()){
                System.out.println(list);
                return;
            }

            for(int i=l;i<list.size();i++){
                Collections.swap(list,l,i);
                permute(list,l+1);
                Collections.swap(list,l,i);
            }
        }

        public static void main(String[] args){
            List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
            permute(list,0);
        }
    }

