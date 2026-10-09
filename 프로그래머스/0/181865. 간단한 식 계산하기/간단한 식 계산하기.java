class Solution {
    public long solution(String binomial) {
        String[] parts = binomial.split(" ");
        long a = Long.parseLong(parts[0]);
        String op = parts[1];
        long b = Long.parseLong(parts[2]);
        
        if (op.equals("+")) return a + b;
        if (op.equals("-")) return a - b;
        
        return a * b;
    }
}