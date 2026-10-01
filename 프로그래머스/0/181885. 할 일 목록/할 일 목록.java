import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        
        int cnt = 0;
        for(int i = 0; i < todo_list.length; i++)
            if(finished[i] == false)
                cnt++;
        
        String[] answer = new String[cnt];
        int j = 0;
        for(int i = 0; i < todo_list.length; i++) {
            if(finished[i] == false) {
                answer[j++] = todo_list[i];
            }
        }
        
        return answer;
        
        /*
        List<String> answer = new ArrayList<>();
        
        for(int i = 0; i < todo_list.length; i++)
            if(!finished[i])
                answer.add(todo_list[i]);
        
        
        return answer.toArray(new String[0]); // answer.toArray(new String[answer.size()]);
        */
    }
}