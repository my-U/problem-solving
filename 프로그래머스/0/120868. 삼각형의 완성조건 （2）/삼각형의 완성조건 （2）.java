import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int max = sides[1];
        
        for(int i = 1; i < sides[0] + sides[1]; i++) {
            if (i <= max) {
                answer = sides[0] + i > max ? answer + 1 : answer;
            }
            else {
                answer++;
            }
        }
        
        return answer;
    }
}