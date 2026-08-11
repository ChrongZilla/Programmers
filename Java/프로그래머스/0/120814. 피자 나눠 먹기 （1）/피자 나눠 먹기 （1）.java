class Solution {
    public int solution(int n) {
        int answer = 0;
        int piece = 7; // piece of pizza
        answer = n / piece;
        if((n % piece) != 0) answer++;
        
        return answer;
    }
}