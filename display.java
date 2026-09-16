void display() {
        if(head== null) return;

        Node temp = head;
        while(temp !=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
         }
         System.out.println();
    }
