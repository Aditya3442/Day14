public class print1tonbacktrack {
    public static void print(int n){
        if(n<1)
            return;
        print(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        print(5);
    }
}
