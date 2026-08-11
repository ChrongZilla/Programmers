import java.util.Scanner;

class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int last = numbers.length - 1;
        answer = (numbers[0] + numbers[last]) / 2.0;
        return answer;
    }
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Solution step = new Solution();
        int[] numbers = new int[100];
        int last = 0;
        System.out.print("Enter numbers > ");
        for (int i = 0; i < 100; i++) {
            numbers[i] = keyboard.nextInt();
            if(numbers[i] == -1) break;
        }
        keyboard.close();
        double answer = step.solution(numbers);
        
        System.out.println("numbers의 원소들의 평균 값은 " + answer + "입니다.");
    }
}