class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[(int)Math.ceil((names.length*1.0)/5)];
        int j = 0;
        
        for(int i = 0; i < names.length; i+=5)
            answer[j++] = names[i];
        
        return answer;
    }
}