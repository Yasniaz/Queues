package com.company;

public class Queue {
    Node head;
    public class Node {
        public Integer item;
        public Node tail;
        public Node(Integer item, Node list) {
            this.item = item;
            this.tail = list;
        }
    }
    public Queue() {
    }
    public void add(Integer item) {
        if(head == null){
            head = new Node(item, null);
        }
        else {
            Node current = head;
            while(current.tail != null){
                current = current.tail;
            }
            current.tail = new Node(item, null);
        }
    }
    public Integer remove() {
        if(head == null){
            return null;
        }
        Integer i = head.item;
        head = head.tail;
        return i;
    }
    public boolean isEmpty(){
        return (head == null);
    }

}