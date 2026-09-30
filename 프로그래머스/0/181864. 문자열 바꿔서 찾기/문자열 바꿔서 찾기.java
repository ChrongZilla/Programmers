class Solution {
    public int solution(String myString, String pat) {
        // A↔B 스왑
        String swapped = myString.replace('A', 'C')  // A를 임시문자로
                                 .replace('B', 'A')  // B→A
                                 .replace('C', 'B'); // 임시→B
        
        return swapped.contains(pat) ? 1 : 0;
    }
}