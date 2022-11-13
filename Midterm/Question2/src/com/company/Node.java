package com.company;

public class Node<T> {
    public T data;
    public Node<T> left;
    public Node<T> right;
    public Node<T> parent;

    public Node(T data, Node left, Node right, Node parent){
        this.data = data;
        this.left = left;
        this.right = right;
        this.parent = parent;
    }
}
