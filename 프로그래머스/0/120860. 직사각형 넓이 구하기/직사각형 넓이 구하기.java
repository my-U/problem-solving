class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x1 = dots[0][0];
        int x2 = dots[1][0];
        int y1 = dots[0][1];
        int y2 = dots[1][1];
        
        if (x1 == x2) {
            x2 = dots[2][0];
        }
        
        if (y1 == y2) {
            y2 = dots[2][1];
        }
        
        answer = Math.abs(x1 - x2) * Math.abs(y1 - y2);
        
        return answer;
    }
}