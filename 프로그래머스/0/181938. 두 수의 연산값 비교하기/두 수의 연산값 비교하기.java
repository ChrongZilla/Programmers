class Solution {
    public long solution(int a, int b) {
        long res = Long.parseLong(a + "" + b);  // a ⊕ b
        long mul = 2L * a * b;                  // 2 * a * b
        
        return res >= mul ? res : mul;
    }
}