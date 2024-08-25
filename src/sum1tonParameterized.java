public class sum1tonParameterized {
    public static void sumall(int i,int n,int sum){
        if(i>n){
            System.out.println(sum);
            return;
        }
        sumall(i+1,n,sum+i);
    }
    public static void main(String[] args) {
        sumall(1,5,0);
    }
}
