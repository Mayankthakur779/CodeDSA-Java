class subsequences{
    public static void subseq(String str,int idx,String newstr){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar=str.charAt(idx);
        
        subseq(str,idx+1,newstr + currchar);

        subseq(str,idx+1,newstr);

    }
    public static void main(String args[]){
        String str="abc";
        subseq(str,0,"");

    }
}