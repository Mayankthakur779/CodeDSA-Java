void insert(int val, int idx) {
        if(idx<0 || idx>size) System.out.println("Invalid Index");

        else if(idx == 0) addAthead(val);

        else if(idx == size) addAttail(val);

        else{
            Node temp = head;
            for(int i =1; i<= idx-1;i++){
                temp=temp.next;
            }
            Node t = new Node(val); // creatint the new node
            t.next= temp.next;
            temp.next=t;
            size++;
        }
    }
