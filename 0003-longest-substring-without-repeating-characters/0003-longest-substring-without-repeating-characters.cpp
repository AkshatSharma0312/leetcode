class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int maxCount = 0;

        for (int i = 0; i < s.length(); i++) {
            int count = 0;

            for (int j = i; j < s.length(); j++) {
                bool duplicateFound = false;

                // check s[j] against every character already in window [i, j-1]
                for (int k = i; k < j; k++) {
                    if (s[k] == s[j]) {
                        duplicateFound = true;
                        break;
                    }
                }

                if (duplicateFound) {
                    break; // stop growing this window, duplicate hit
                } else {
                    count += 1;
                }
            }

            if (count > maxCount) {
                maxCount = count;
            }
        }

        return maxCount;
    }
};