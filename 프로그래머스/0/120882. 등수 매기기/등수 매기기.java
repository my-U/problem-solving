class Solution {
    public int[] solution(int[][] score) {
        int length = score.length;
        int[] answer = new int[length];
        
        for(int i = 0; i < length; i++) {
            int num1 = score[i][0] + score[i][1];
            int count = 0;

            for(int j = 0; j < length; j++) {
                if (i == j) continue;
                else {
                    int num2 = score[j][0] + score[j][1];
                    count = num1 < num2 ? count + 1 : count;
                }
            }
            answer[i] = count + 1;
        }
        
        return answer;
    }
}