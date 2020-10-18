package Ex10;

import java.util.Scanner;

public class Functions {
    Functions(){

    }

    void Rec_1 (int a) {
        if (a < 5) {
            for (int i = 0; i < a; ++i) {
                System.out.print(a);
                System.out.print(" ");
            }
            a++;
            Rec_1(a);
        }
    }

    void Num_2 (int a){
        for (int i=0;i<a;++i) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    void Num_3 (int a,int b){
        if (a<b) {
            for (int i = a; i < b+1; ++i) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
        if (b<a) {
            for (int i = a; i >= b; --i) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
    int Num_4(int len, int sum, int k, int s) {
        if(len == k) {
            return sum = s;
        }

        int c = (len == 0 ? 1 : 0);
        int res = 0;
        for(int i = c; i < 10; i++) {
            res += Num_4(len + 1, sum + i, k, s);
        }

        return res;
    }

    void N_4(int a,int b){
        System.out.println(Num_4(a,b,a,b) - 1 );
    }

    static int Rec_5(int num){
        if(num>0)
        return (num%10+Rec_5(num/10));
        return 0;
    }
    static boolean Rec_6(int n, int i) {
        if (n < 2) {
            return false;
        }
        else if (n == 2) {
            return true;
        }
        else if (n % i == 0) {
            return false;
        }
        else if (i < n / 2) {
            return Rec_6(n, i + 1);
        } else {
            return true;
        }
    }
    static String  N_6(int a){
        if (Rec_6(a,2))
            return "YES";
        else
            return "NO";
    }

    static void Rec_7(int n, int k) {
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % k == 0) {
            System.out.println(k);
            Rec_7(n / k, k);
        }
        else {
            Rec_7(n, ++k);
        }
    }
    static void N_7(int a)
    {
        Rec_7(a,2);
    }
    static boolean Rec_8(String word, int step){
        if (word.length()/2==step)
            return true;
        String a =word.substring(step, step+1);
        String b = word.substring(word.length() - step - 1, word.length() - step);
        //System.out.println(a);
        //System.out.println(b);
        if (a.equals(b)){
            //System.out.println("dawdawd");
            return Rec_8(word,step+1);
        }
        return false;
    }
    static String N_8(String word){
        if (Rec_8(word,0))
            return "YES";
        else
            return "NO";
    }

    static int Rec_9(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if ((a == 0) ||( b == 0))
        {
            return 1;
        }
        return Rec_9(a, b - 1) + Rec_9(a - 1, b - 1);
    }

    static int Rec_10 (int num,int i){
        return (num==0) ? i : Rec_10( num/10, i*10 + num%10 );
    }

    static int Rec_11 (int backnum){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if ((backnum==0) && (num == 0)){
            return 0;
        }
        if (num ==1)  {return Rec_11(num) + 1;}
        else {return Rec_11(num);}
    }
    static int N_11(){
        return Rec_11(1);
    }
    static void Rec_12 (){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if (num %2 == 1){
            System.out.println(num);
        }
        if (num != 0){
            Rec_12 ();
        }
    }
    static void Rec_13()
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num != 0) {
            System.out.println(num);
            num = scan.nextInt();
        }
        if (num != 0) {
            Rec_13();
        }
    }
    static void Rec_14(int n){
        if (n!=0) {
            Rec_14(n / 10);
            System.out.print(n % 10);
            System.out.print(" ");
        }
    }
    static void Rec_15(int n){
        if (n!=0) {
            System.out.print(n % 10);
            System.out.print(" ");
            Rec_15(n / 10);
        }
    }
    static int Rec_16 (int m){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num != 0) {
            if (num>m){
                m=num;
            }
            if (num==Rec_16(m)){
                return 1000+Rec_16(m);
            }
        }
        return m;
    }
    static void N_16(){
        System.out.println(Rec_16(0)%1000);
    }
    static int Rec_17 (int m){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num != 0) {
            if (num>m){
                m=num;
            }
            return Rec_17(m);
        }
        return m;
    }
    public static void main(String[] args){
        Functions Fun = new Functions();
        //Fun.Rec_1(0);
        //Fun.Num_2(6);
        //Fun.Num_3(4,9);
        //Fun.N_4(2,2);
        //System.out.println(Rec_5(2678));
        //System.out.println(N_6(25));
        //N_7(100);
        //System.out.println(N_8("TENET"));
        //System.out.println(Rec_9(7,8));
        //System.out.println(Rec_10(16269428,0));
        //System.out.println(N_11());
        //Rec_12();
        //Rec_13();
        //Rec_14(236794);
        //Rec_15(236794);
        //N_16();
        System.out.println(Rec_17(0));
    }
}
