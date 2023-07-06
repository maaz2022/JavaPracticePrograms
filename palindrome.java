
class palindrome{
        public static void main(String[] args) {
    //  codes to implement function:
}
// check number is palindrome or not by convert int to str:

public static boolean isPalindromee(int x) {
        String num=String.valueOf(x);
        int l=num.length();
        for(int i=0;i<l/2;i++){
            char digit1= num.charAt(i);
            char digit2=num.charAt(l-i-1);
            if (digit1!=digit2){
                return false;
            }
            }
            return true;
        }
// check number is palindrome or not without converting int to str:

public static boolean isPalindrome(int n) {
    int temp = n;
    int reverse = 0;
    while (n > 0) {
        int remainder = n % 10;
        reverse = (reverse * 10) + remainder;
        n = n / 10;
    }
    return temp == reverse;
}
}