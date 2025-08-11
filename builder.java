import java.util.*;
class builder{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Mayank");
        System.out.println(sb);
        //particular char
        System.out.println(sb.charAt(0));
        //set char at index
        sb.setCharAt(0,'n');
        System.out.println(sb);
        //insert
        sb.insert(0,'M');
        System.out.println(sb);
        //delete
        sb.delete(1,2);
        System.out.println(sb);
        //appernd
        sb.append(" T");
        System.out.println(sb);
    }
}