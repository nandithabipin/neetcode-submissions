class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res=new HashMap<>();
        for(String s:strs){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String sort=new String(c);
            res.putIfAbsent(sort,new ArrayList<>());
            res.get(sort).add(s);
        }
        return new ArrayList<>(res.values());
        
    }
}
