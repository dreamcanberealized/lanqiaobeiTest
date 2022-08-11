package com.datastruct;

/**
 * @author mikey
 * @create 2022-06-05 22:54
 */
public class LinkedTest {
    public static void main(String[] args) {
        Linked l = new Linked();
        for (int i = 1; i < 5; i++) {
            Node node = new Node(i);
            l.addNode(node);
        }
        Node  head = l.getHead().next;
        Node temp =head.next;
        Node cur = head;
        while(cur!=null&&cur.next!=null){
            Node t = cur.next;
            Node t1 =cur.next.next;
            cur.next =t1;
            t.next = cur;
        }
        temp.print();
    }

}
