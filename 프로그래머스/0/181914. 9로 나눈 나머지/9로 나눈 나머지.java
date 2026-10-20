class Solution {
    public int solution(String number) {
        int sum = 0;
        for (char c : number.toCharArray()) {
            // '3' - '0' = 숫자 3
            sum += c - '0';
        }
        return sum % 9;
    }
}