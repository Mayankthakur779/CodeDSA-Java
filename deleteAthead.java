void deleteAthead(){
        if(head== null){
            System.out.println("Linked list is empty");
            return;
        }

        head = head.next;
        if(head ==null) tail=null;
        size--;


    }
