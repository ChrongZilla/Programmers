import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        // delete_list를 Set으로 변환 (빠른 검색용)
        Set<Integer> deleteSet = new HashSet<>();
        for (int d : delete_list) {
            deleteSet.add(d);
        }

        // arr 순서 유지하면서 delete_list에 없는 것만 담기
        List<Integer> list = new ArrayList<>();
        for (int a : arr) {
            if (!deleteSet.contains(a)) {
                list.add(a);
            }
        }

        // List → int[] 변환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}