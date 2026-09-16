void addAttail(int val){
        Node temp=new Node(val); // creating a new Node
        if (tail==null){
            head=tail=temp;
        }
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;

    }
