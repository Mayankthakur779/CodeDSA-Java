public class RemoveDuplicate{
    public static boolean [] map=new boolean[26];
    public static void removeDuplicates(String str,int idx,String newstr){
        if (idx == str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            removeDuplicates(str,idx+1,newstr);
        }else{
            newstr+=currchar;
            map[currchar-'a']=true;
            removeDuplicates(str,idx+1,newstr);
        }

    }
    public static void main(String args[]){
        String str="abbacgssa";
        removeDuplicates(str,0,"");
    }
}