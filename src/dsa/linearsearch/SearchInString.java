package dsa.linearsearch;

public class SearchInString {
    public static void main(String[] args) {
        String str="Ritesh";
        System.out.println(search(str,'s'));
    }

    static int search(String str,char target){
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]==target){
                return i;
            }
        }
        return -1;
    }
}
