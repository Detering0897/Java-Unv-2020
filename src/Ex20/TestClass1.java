package Ex20;
import java.util.Arrays;

class Generic2 <E> {
    private E[] test2;

    public void setTest2(E[] test2) {
        this.test2 = test2;
    }

    public E[] getTest2() {
        return test2;
    }

    public int getLength(){
        return test2.length;
    }
    public E getIndex(int i){
        return test2[i];
    }
}

public class TestClass1 {

    public static <E> void arr(E [] massive){
        E[] e1=massive;
        Generic2<E>arr=new Generic2<E>();
        arr.setTest2(e1);
        System.out.print(" ");
        for(int i=0;i<arr.getLength();i++){
            System.out.print(arr.getIndex(i)+" ");
        }
        System.out.println();

    }
    public static void main(String[] args){
        String []strings={"Hello,","it`s","me"};
        Integer[]integers={0,1,2,3,4,5,6,7,8,9};
        Double[]doubles={0.2,2.6,45.456,6.78979};
        arr(strings);
        arr(integers);
        arr(doubles);
    }
}
