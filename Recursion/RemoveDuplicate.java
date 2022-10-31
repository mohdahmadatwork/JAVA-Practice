public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "hwwlleellmmnnskodff";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
    public static void removeDuplicates(String str,int idx,StringBuilder newStr,boolean map[]) {
        if(idx == str.length()){    
            System.out.println(newStr);
            return;
        }
        char currentchar = str.charAt(idx);
        if(map[currentchar-'a']==true){
            removeDuplicates(str, idx+1, newStr, map);
        } else{
            map[currentchar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currentchar), map);
        }
    }
}
