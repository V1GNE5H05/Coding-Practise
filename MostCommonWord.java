class Solution {
    public static boolean isPresent(String[] banned, String key) {
        for(int i = 0; i < banned.length; i++) {
            if(banned[i].equals(key)) return true;
        }
        return false;
    }
    public String mostCommonWord(String paragraph, String[] banned) {
        String pg = paragraph.toLowerCase();
        HashMap<String, Integer> map = new HashMap<>();
        String[] st = pg.split("[^a-zA-Z]+");
        int i;
        for(i = 0; i < st.length; i++) {
            String s = st[i];
            if(map.containsKey(s)) {
                int c = map.get(s);
                c++;
                map.replace(s, c);
            }
            else {
                map.put(s, 1);
            }
        }
        int max = 0;
        String s = "";
        for(String key : map.keySet()) {
            if(isPresent(banned, key)) continue;
            else if(map.get(key) > max) {
                max = map.get(key);
                s = key;
            }
        }
        return s;
    }
}
