package com.company;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree <T>{
    public Node<T> root;
    public BinaryTree(){

    }

    public void preOrder(){
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node<T> node){
        if(node != null){
            System.out.println(node.data +", ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void inOrder(){
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node<T> node){
        if(node != null){
            System.out.println(node.data +", ");
            inOrder(node.left);
            inOrder(node.right);
        }
    }

    public void postOrder(){
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node<T> node){
        if(node != null){
            System.out.println(node.data +", ");
            postOrder(node.left);
            postOrder(node.right);
        }
    }

    public void levelOrder(){
        if(root == null){
            return;
        }

        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (queue.size()!=0){
            Node<T> node = queue.remove();
            if (node!= null){
                System.out.printf(node.data + ", ");
                if(node.left!= null){
                    queue.add(node.left);
                }
                if(node.right!= null){
                    queue.add(node.right);
                }
            } else{
                System.out.println();
                if (queue.size()==0){
                    break;
                }
                queue.add(null);
            }
        }

    }

    public int size(){
        return size(root);
    }

    public int size(Node<T> node){
        if (node == null){
            return 0;
        }
        return 1+size(node.left)+size(node.right);
    }

    public int height(){
        return height(root);
    }

    public int height(Node<T> node){
        if (node == null){
            return 0;
        }
        return 1+Math.max(height(node.left),height((node.right)));
    }

    public void printTopLevelView(){
        if(root == null){
            return;
        }
        HashMap<Integer, Node<T>> map = new HashMap<>();
        printTopLevelView(root,0, map);

    }

    private void printTopLevelView(Node<T> node ,Integer distance, HashMap<Integer,Node<T>> map){
        if (node!=null){
            if (!map.containsKey(distance)){
                map.put(distance, node);
            }
            printTopLevelView(node.left,distance-1,map);
            printTopLevelView(node.right,distance+1,map);
        }

    }

}
