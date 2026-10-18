class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        
        String id = id_pw[0];
        String password = id_pw[1];
        
        for(int i = 0; i < db.length; i++) {
            if (db[i][0].equals(id) && db[i][1].equals(password)) {
                return "login";                
            }
            else if (db[i][0].equals(id) && !db[i][1].equals(password)) {
                answer = "wrong pw";                
            }
            else {
                answer = "fail";
            }
            
            if (answer.equals("wrong pw")) {
                return answer;
            }
        }
        
        return answer;
    }
}