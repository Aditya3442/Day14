public class StringPalindrome {
    public static  boolean isPalindrome(int i,int n,String s){
        if(i==n/2)
            return true;
        if(s.charAt(i)!=s.charAt(n-i-1))
            return false;
        return isPalindrome(i+1,n,s);
    }
    public static void main(String[] args) {
        String s="12321";
        System.out.println(isPalindrome(0,s.length(),s));
    }
}
