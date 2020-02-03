public class appendAndDelete {

    static String appendAndDelete(String s, String t, int k) {
        //StringBuffer str = new StringBuffer(s);
        int index=0;
        for(int i=0,j=0;i<s.length() && j<t.length();i++,j++){
            if(s.charAt(i)!=t.charAt(j)) {
                index = i;
                break;
            }
        }
        int sRemain = s.length()-index;
        int tRemain = t.length()-index;
        if(sRemain+tRemain<=k)
            return "Yes";
        return "No";
    }

    public static void main(String[] args) {
        System.out.println(appendAndDelete("aaaaaaaaaa", "aaaaa", 7));
    }
}
