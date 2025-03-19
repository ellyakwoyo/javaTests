class Palindrome {
// Check if an integer is a palindrome in java
    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);

        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start ++;
            end --;
            }
            return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(222));
    }

}