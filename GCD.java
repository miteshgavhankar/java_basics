class Solution {
    public int GCD(int n1, int n2) {

        int largest = Math.min(n1, n2);
        for(int i = Math.min(n1, n2); i > 0; i--){
            if(n1%i == 0 && n2%i==0){
                largest = i;
                return largest;
            }
        }
        return largest;
    }
}
