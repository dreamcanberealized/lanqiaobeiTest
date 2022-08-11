package com.datastruct;

/**
 * @author mikey
 * @create 2022-06-05 22:47
 */
public class Linked {
//    节点数量
    private int size;
    private Node head;
//对象实例化
    public Linked() {
        head=new Node(0,null);
    }
    public  Node getHead(){
        return head;
    }
//    添加节点
//    头插法|尾插法
    public void addNode(Node node){
        if(head.next==null){
            head.next=node;
            return ;
        }
        Node p =head;
        while(p.next!=null){
            p=p.next;
        }
        p.next=node;
    }
//    打印链表
    public void print(){
        Node p = head.next;
        while (p!=null){
            System.out.print(p.val+"--->");
            p=p.next;
        }
    }
//    反转链表
    public Node reverseLink(){
        Node l = new Node(0);
        Node h = head;
        Node p=null;
        while(h!=null ){
            p = h.next;
            h.next=l.next;
            l.next=h;
            h = p;
        }
        return l.next;
    }
}
