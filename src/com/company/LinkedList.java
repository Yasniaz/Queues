package com.company;
import com.company.BinaryTree.Node;

public class LinkedList {

    public SNode head;
    public SNode tail;

    public SNode getHead(){
        return this.head;
    }

    public String toString() {
        System.out.println("Elements include: ");
        StringBuilder stringBuilder = new StringBuilder();

        if (head == null) {
            stringBuilder.append("No elements found");
            return stringBuilder.toString();
        } else {
            SNode current = head;
            while (current != null) {
                stringBuilder.append(current.getKey() + current.getValue() + "\t");
                current = current.nxt;
            }
            return stringBuilder.toString();
        }
    }

    public void appendData(Integer key, Integer value) {

        SNode current = head;
        if (head == null) {
            head = new SNode(key, value);
        } else {

            while (current.nxt != null) {
                current = current.nxt;
            }
            current.nxt = new SNode(key, value);
        }
    }

    public void appendNode(SNode node) {

        if (head == null) {
            head = node;
            tail = head;
            return;
        } else {
            if(tail.nxt != null){
                tail.nxt.nxt = node;
                return;
            }
            SNode current = head;
            while (current.nxt != null) {
                current = current.nxt;
            }
            current.nxt = node;
            tail = current.nxt;
        }
    }

}

