package com.company;

class SNode {
    SNode nxt;
    SNode prev;
    Integer key;
    Integer value;

    public void setData(Integer key, Integer value){
        this.value = value;
        this.key = key;
    }
    public SNode getNode(){
        return this;
    }
    public int getKey(){
        return this.key;
    }
    public int getValue(){
        return this.value;
    }
    public SNode(Integer key, Integer data) {
        setData(key, value);
    }

}
