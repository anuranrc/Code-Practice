package com.arc.datastructures;

public class LinkedList {
    Node head;
    public static class Node{
        int val;
        Node next;
        public Node(int value, Node next){
            this.val = value;
            this.next = next;
        }
    }

    public static void appendNode(LinkedList list, int data){

        if(list.head == null) {
            list.head = new Node(data,null);
        }
        else {
            Node temp = list.head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next =  new Node(data,null);
        }
    }

    public static void prependNode(LinkedList list, int data){
        if(list.head == null) {
            list.head = new Node(data,null);
        }
        else {
            Node temp = list.head;
            list.head = new Node(data, null);
            list.head.next = temp;
        }
    }

    public  static  void delete(LinkedList list, Node nd){
        Node temp = list.head;
        if(temp.val == nd.val){
            list.head = list.head.next;
        }
        else {
            while (temp.next != null){
                if(temp.next.val == nd.val){
                    temp.next = temp.next.next;
                    break;
                }
                temp = temp.next;
            }
        }
    }

    static void  printList(LinkedList list){
        Node temp = list.head;
        while( temp!=null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public  static  void main(String[] args){
        LinkedList list = new LinkedList();
        LinkedList list2 = new LinkedList();
        Node nd = new Node(12, null);
        //list.head= nd;
        appendNode(list,2);
        appendNode(list,4);
        appendNode(list,13);
        appendNode(list,7);
        appendNode(list,2);
        appendNode(list,67);
        prependNode(list2, 34);
        prependNode(list2, 2);
        prependNode(list2, 12);
        prependNode(list2, 9);
        prependNode(list2, 3);
        delete(list2, nd);
        printList(list);
        System.out.println(" ");
        printList(list2);
    }

}


