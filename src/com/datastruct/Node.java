package com.datastruct;

/**
 * @author mikey
 * @create 2022-06-05 22:46
 */
public class Node {
    public int val;
    public Node next;

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

    public Node(int val) {
        this.val = val;
    }

    public Node() {

    }
    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
    //    打印链表
    public void print(){
        Node p = this;
        while (p!=null){
            System.out.print(p.val+"--->");
            p=p.next;
        }
    }

}
