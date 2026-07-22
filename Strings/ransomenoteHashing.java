class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();
         HashMap<Character,Integer> mapx=new HashMap<>();

         //magazine
        for(int i=0;i<magazine.length();i++)
        {
            char ch=magazine.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

       //ransomenote
        for(int i=0;i<ransomNote.length();i++)
        {
            char ch=ransomNote.charAt(i);
            mapx.put(ch,mapx.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<ransomNote.length();i++)
         {
            char ch=ransomNote.charAt(i);
             if(mapx.getOrDefault(ch,0)>map.getOrDefault(ch,0))
             {
                return false;
             }
         }
         return true;
    }
}