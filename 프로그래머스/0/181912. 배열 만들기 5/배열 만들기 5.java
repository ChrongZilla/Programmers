import java.util.*;

class Solution {
    public long[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Long> list = new ArrayList<>();
        for (String str : intStrs) {
            long val = Long.parseLong(str.substring(s, s + l));
            if (val > k) list.add(val);
        }
        long[] answer = new long[list.size()];
        for (int i = 0; i < list.size(); i++) answer[i] = list.get(i);
        return answer;
    }
}