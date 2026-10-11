class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        // n번째 이후 원소를 앞에
        for (int i = n; i < num_list.length; i++) {
            answer[i - n] = num_list[i];
        }
        
        // n번째까지 원소를 뒤에
        for (int i = 0; i < n; i++) {
            answer[num_list.length - n + i] = num_list[i];
        }
        
        return answer;
    }
}