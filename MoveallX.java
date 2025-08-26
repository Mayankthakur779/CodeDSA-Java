class Endx{
    public static void sortx(String str,int idx,int count,String newstr ){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newstr+='x';
            }
            System.out.println(newstr);
            return;
        }
        char currchar=str.charAt(idx);
        if(currchar=='x'){
            count++;
            sortx(str,idx+1,count,newstr);
        }
        else{
            newstr+=currchar;  
            sortx(str,idx+1,count,newstr);
        }
    } 
    public static void main(String args[]){
        String str="abxxbxsxh";
        String newstr="";
        sortx(str,0,0,newstr);
    }
}