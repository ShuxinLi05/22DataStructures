package com.company;

public class Node<T> {

    public T data;
    public Node<T> left;
    public Node<T> right;

    public Node<T> nextRight;

    public Node() {}

    public Node(T data){
        this.data = data;
    }
    public Node(T data, Node left, Node right, Node nextRight){
        this.data = data;
        this.left = left;
        this.right = right;
        this.nextRight = nextRight;
    }

};
