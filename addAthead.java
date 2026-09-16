void  addAthead(int val) {
        Node temp = new Node(val);
        if (head == null) head = tail = temp;

        else {
            temp.next = head;
            head = temp;
        }

        size++;
    }
