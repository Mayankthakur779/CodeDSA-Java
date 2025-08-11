class Strings{
    public static void main(String args[]){
        String firstName="Mayank";
        String lastName="Thakur";
        String fullName=firstName +" "+ lastName;
        System.out.println(fullName);
        //length
        System.out.println(fullName.length());
        
        //charAt
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
        String rev="hello";
        System.out.println(rev.length());
    }
}