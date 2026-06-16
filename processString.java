class Solution {
    public String processStr(String s) {
        String rs = "";
        int i, j;
        for(i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '*' && rs.length() >= 1) {
                rs = rs.substring(0, rs.length()-1);
            }
            else if(s.charAt(i) == '#') {
                rs += rs;
            }
            else if(s.charAt(i) == '%') {
                String rev = "";
                for(j = rs.length()-1; j >= 0; j--) {
                    rev += rs.charAt(j);
                }
                rs = rev;
            }
            else if(s.charAt(i) != '*') {
                rs += s.charAt(i);
            }
        }
        return rs;
    }
}
