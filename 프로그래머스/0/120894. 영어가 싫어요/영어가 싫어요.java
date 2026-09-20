import java.util.*;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        char[] cArray = numbers.toCharArray();
        String[] n = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        List<String> nlist = Arrays.asList(n);
        String s = "";
        
        for(char c : cArray) {
            s += c;
            if(nlist.contains(s)) {
                answer = (answer * 10) + nlist.indexOf(s);
                s = "";
            }
        }
        
        return answer;
    }
}