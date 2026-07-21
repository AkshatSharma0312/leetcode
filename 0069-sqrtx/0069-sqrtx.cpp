class Solution {
public:
    int mySqrt(int x) {
        if(x == 0)
            return 0;
        else if(x == 1)
            return 1;

        for(long int i = 1; i < x/2 + 2; i++) {
            if(i * i > x)
                return i - 1;
        }

        return -1;
    }
};