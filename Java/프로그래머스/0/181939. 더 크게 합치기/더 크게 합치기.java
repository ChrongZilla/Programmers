class Solution {
    public int cal(int x, int y) {
        String result = String.valueOf(x) + String.valueOf(y);
        return Integer.parseInt(result);
    }
    
    public int solution(int a, int b) {        
        return cal(a, b) >= cal(b, a) ? cal(a,b) : cal(b,a);
    }
}