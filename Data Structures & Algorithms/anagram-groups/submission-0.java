class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res=new HashMap<>();
        for(String s: strs)
        {
            char[] charArray=s.toCharArray();
            Arrays.sort(charArray);
            String ss=new String(charArray);
            res.putIfAbsent(ss,new ArrayList<>());
            res.get(ss).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
