class Solution {
    public boolean isPalindrome(int n) {
        int last = n;
        int num = 0;
        while(n > 0){
            int digit = n % 10;
            num = (num * 10) + digit;
            n = n / 10;
        }

        if(last == num){
            return true;
        } else {
            return false;
        }

    }
}
