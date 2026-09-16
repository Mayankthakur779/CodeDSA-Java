    int Search(int val){

        if(head==null) return -1;

        Node temp=head;
        while(temp!= null){
            if(temp.val== val) return idx;
            temp= temp.next;
            idx++;
        }
        return -1;
    }
