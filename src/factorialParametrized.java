public class factorialParametrized {
    public static void fact(int n,int f){
        if(n==0){
            System.out.println(f);
            return;
        }
        fact(n-1,f*n);
    }
    public static void main(String[] args) {
        fact(4,1);
    }
}
