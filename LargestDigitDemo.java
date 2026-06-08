public class LargestDigit {
    public static void main(String[] args) {
        System.out.println("Largest Number");
        System.out.println(findLargest(5592));
    }

    static int findLargest(int num){

        int largest = 0;
        while (num > 0) {
            int last = num % 10;
            if (last > largest) {
                largest = last;
            }
            num = num / 10;
        }

        return largest;

    }
}
