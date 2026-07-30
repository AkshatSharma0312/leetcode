class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int result = 1;
        for (int i = 2; i <= n-k; i++) {
            result *= i;
        }
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        int resul = 1;
        for (int i = 2; i <= k; i++) {
            resul *= i;
        }
        List<List<Integer>> combinations = new ArrayList<>();
        backtrack(combinations, new ArrayList<>(), 1, n, k);
        return combinations;
    }

    private void backtrack(List<List<Integer>> combinations, List<Integer> current, int start, int n, int k) {
        if (current.size() == k) {
            combinations.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i <= n; i++) {
            current.add(i);
            backtrack(combinations, current, i + 1, n, k);
            current.remove(current.size() - 1);
        }

    }
}