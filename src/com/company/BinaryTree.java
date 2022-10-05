package com.company;
import java.util.Iterator;

public class BinaryTree implements Iterable<Integer> {
    Node root;

    @Override
    public Iterator<Integer> iterator() {
        return new TreeIterator(this);
    }

    public void addData(Integer key, Integer value) {
        if (root == null) {
            root = new Node(key, value);
        } else {
            root.add(key, value);
        }
    }
    public void BinaryTree() {
        root = null;
    }

    public class Node {
        public Integer key;
        public Integer value;
        public Node left, right;

        public Node(Integer key, Integer value) {
            this.key = key;
            this.value = value;
            this.left = this.right = null;
        }

        public Integer lookUp(Integer key) {
            if (this.key == key) {
                return this.value;
            } else {
                if (this.key > key && left != null) {
                    return left.lookUp(key);
                } else if (this.key < key && left != null) {
                    return right.lookUp(key);
                }
            }
            return null;
        }

        public void print() {
            if (left != null)
                left.print();
            System.out.println(" key: " + key + "\tvalue: " + value);
            if (right != null)
                right.print();
        }

        public int getData() {
            return this.value;
        }

        public void add(Integer key, Integer value) {
            if (this.key == key) {
                this.value = value;
                return;
            }
            if (this.key > key) {
                if (this.left != null) {
                    this.left.add(key, value);
                } else {
                    this.left = new Node(key, value);
                }
            } else {
                if (this.right != null) {
                    this.right.add(key, value);
                } else {
                    this.right = new Node(key, value);
                }
            }
        }
    }

    public Integer lookup(Integer key) {
        if (root == null) {
            return null;
        } else {
            return root.lookUp(key);
        }
    }
}


