public class IsAnagram {
    public static boolean isAnagram(String s1, String s2){
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        s1 = s1.replace(" ","");
        s2 = s2.replace(" ", "");

        int[] count = new int[26];
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i = 0; i < s1.length(); i++){
            count[s1.charAt(i) - 'a']++;
        }
        for(int i = 0; i< s2.length(); i++){
            count[s2.charAt(i)- 'a']--;
        }
        for(int c : count){
            if(c!= 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s1 = "dirty room";
        String s2 = "dormitory";
        System.out.println(isAnagram(s1,s2));
    }
}
