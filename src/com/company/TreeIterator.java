package com.company;
import com.company.BinaryTree.Node;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class TreeIterator implements Iterator<Integer> {
    private Integer nxt;
    private Queue queue;
    public TreeIterator(BinaryTree tree) {
        queue = new Queue();
        contain(tree.root);
        nxt = queue.remove();
    }

    private void contain(Node current){
        if(current.right != null){
            contain(current.right);
        }
        queue.add(current.key);
        if(current.left != null){
            contain(current.left);
        }
    }

    @Override
   public boolean hasNext() {
        return (nxt != null);
    }
    @Override
    public Integer next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        Integer n = nxt;
        nxt = queue.remove();
        return n;
    }
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
