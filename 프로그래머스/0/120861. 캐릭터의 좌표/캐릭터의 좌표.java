import java.util.*;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int maxX = (board[0] - 1) / 2;
        int maxY = (board[1] - 1) / 2;
        
        for(String k : keyinput) {
            switch(k) {
                case "left":
                    answer[0] -= 1; break;
                case "right":
                    answer[0] += 1; break;
                case "up":
                    answer[1] += 1; break;
                case "down":
                    answer[1] -= 1; break;
            }    
            
            answer[0] = Math.max(-maxX, Math.min(maxX, answer[0]));
            answer[1] = Math.max(-maxY, Math.min(maxY, answer[1]));
        }
        
        
        return answer;
    }
}