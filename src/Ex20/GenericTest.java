package Ex20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Generic1<E> {

    private List<E> List =new ArrayList<>();
    public Generic1(E[] array){

        List.addAll(Arrays.asList(array));
    }
    public void showList(){
        for(Object ls : List){
            System.out.print(ls+" ");
        }
        System.out.println();
    }
    public void add(E element){

        List.add(element);
    }
    public List getList(){

        return List;
    }
}

public class GenericTest {
    public static void main(String[] args) {
        Integer[] num={0,1,2,3,4,5,6,7,8,9};
        String[]  letter={"zero","one","two","three","four","five","six","seven","eight","nine"};
        Generic1<Integer> ListInt=new Generic1<>(num);
        ListInt.showList();
        Generic1<String> ListString=new Generic1<>(letter);
        ListString.showList();

    }
}
