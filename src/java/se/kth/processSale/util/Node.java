package se.kth.processSale.util;

import static sun.misc.Version.print;

public class Node<T> {
    public T item;
    public Node next = null;

//    public Node(Node<T> node){
//        this.item = node.item;
//        this.next = node.next;
//
//
//    }
    public static <E> Node<E> copyList(Node<E> list){
        if(list == null){
            return null;
        }
       Node<E> firstNodeInNewList = new Node<E>();
       Node<E> oldTraverse;
       Node<E> newTraverse = firstNodeInNewList;
       newTraverse.item = list.item;
       oldTraverse = list.next;
       while (oldTraverse != null){
            newTraverse.next = new Node<E>();
            newTraverse = newTraverse.next;
            newTraverse.item = oldTraverse.item;
            oldTraverse = oldTraverse.next;
       }
       return firstNodeInNewList;
    };
    public int getLength(){
        int length=1;
        Node<T> nextNode =  new Node<T>();
        nextNode.next = this.next;
        while(nextNode.next != null){
            length++;
            nextNode = nextNode.next;
        }

        return length;
    }
    public void printList(){
        Node listTraverse = this.next;
        System.out.println(this.item);
        while (listTraverse != null){
            System.out.println(listTraverse.item);
            listTraverse = listTraverse.next;
        }

    }
    public String toString(){
        Node listTraverse = this.next;
        String listAsString = this.item.toString()+"\n";
        while (listTraverse != null){
            listAsString+=listTraverse.item.toString()+"\n";
            listTraverse = listTraverse.next;
        }
        return listAsString;

    }


}
