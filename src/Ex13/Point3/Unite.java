package Ex13.Point3;


public class Unite {

    Unite (){
        int [] arr1 = new int[]{5,7,8,11,4,3};
        int [] arr2 = new int[]{9,6,10,0,2,1};
        int [] arr3 = new int [arr1.length + arr2.length];
        int min = 0, exMin =-1;

        for (int i = 0; i < arr3.length; ++i){
            min = 20;
            for (int j = 0; j < 6; ++j){
                if((arr1[j] <min)&&(arr1[j]>exMin))min=arr1[j];
                if((arr2[j] <min)&&(arr2[j]>exMin))min=arr2[j];
            }
            exMin = min;
            arr3[i] = min;
        }
        for (int i = 0; i < arr3.length; ++i){
            System.out.print(arr3[i]);
            System.out.print(" ");
        }
    }
    public static void main(String[] args)
    {
        Unite un = new Unite();
    }
}
