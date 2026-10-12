
class Solution {
    public boolean checkPerfectNumber(int num) {
        int factors = 0;
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                factors += i;
            }
        }

        if (factors == num) {
            return true;
        }

        return false;
    }
}
