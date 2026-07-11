class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < s.length(); i++) {
            unordered_set<char> seen;   // tracks characters in current window [i, j]
            count = 0;

            for (int j = i; j < s.length(); j++) {
                if (seen.find(s[j]) != seen.end()) {
                    break;               // duplicate found, stop extending this window
                }
                else {
                    seen.insert(s[j]);
                    count += 1;
                }
            }

            maxCount = max(maxCount, count);
        }

        return maxCount;
    }
};