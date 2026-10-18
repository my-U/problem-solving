import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        
        for(String d : dic) {
            for(String s : spell) {
                if (d.indexOf(s) != -1 && (d.indexOf(s) == d.lastIndexOf(s))) {
                    answer = 1;
                } else {
                    answer = 2;
                    break;
                }
            }
            if(answer == 1 && (spell.length == d.length())) {
                return answer;
            }
        }
        return 2;
    }
}