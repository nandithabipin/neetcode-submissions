class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sa=s.toCharArray();
        char[] ta=t.toCharArray();
        Arrays.sort(sa);
        Arrays.sort(ta);
        int count=0;
        if(s.length()==t.length()){
        for(int i=0;i<t.length();i++){
            if(sa[i]==ta[i])
            count++;
        }
        }
        if(count==s.length()) return true;
        
        
        return false;

    }
}
