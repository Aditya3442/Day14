public class sum1tonfunctional {
    public static int sumall(int i,int n){
        if(i>n)
            return 0;
        return i+sumall(i+1,n);
    }
    public static void main(String[] args) {
        System.out.println(sumall(1,5));
    }
}
