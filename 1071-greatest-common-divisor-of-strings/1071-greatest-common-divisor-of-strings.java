import java.math.BigInteger;

class Solution {

    public String gcdOfStrings(String str1, String str2) {

        if ((str1 + str2).equals(str2 + str1)) {

            return str1.substring(0, 
                BigInteger.valueOf(str1.length())
                .gcd(BigInteger.valueOf(str2.length()))
                .intValue()
            );

        }

        return "";
    }
}