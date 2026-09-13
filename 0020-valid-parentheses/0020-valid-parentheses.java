class Solution {
    public boolean isValid(String s) {
        boolean changed = true;

        while (changed && !s.isEmpty()) {
            changed = false;

            for (int i = 0; i < s.length() - 1; i++) {
                String pair = s.substring(i, i + 2);

                if (pair.equals("()") ||
                    pair.equals("{}") ||
                    pair.equals("[]")) {

                    s = s.substring(0, i) + s.substring(i + 2);
                    changed = true;
                    break;
                }
            }
        }

        return s.isEmpty();
    }
}