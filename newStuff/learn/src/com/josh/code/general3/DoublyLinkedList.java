package com.josh.code.general3;

/**
 * Created by Munish on 5/22/17.
 */
public class DoublyLinkedList {

    static Node head = null;
    static Node tail = null;
    static int data;


    public static void main(String[] args) {
        Node first = new Node(1, null, null);

        Node second = new Node(2, first, null);
        first.setNext(second);

        Node third = new Node(3, second, null);
        second.setNext(third);

        Node fourth = new Node(4, third, null);
        third.setNext(fourth);

        head = first;
        tail = fourth;


        printList();

        System.out.println("------");
        System.out.println("head is :" + head.data);
        System.out.println("tail is :" + tail.data);


        reverseList();

        System.out.println("second list...");
        System.out.println("222...head is :" + head.data);
        System.out.println("222...tail is :" + tail.data);

        printList();

    }


    public static void reverseList() {


        Node temp = head;
        head = tail;
        tail = temp;


        Node previous = null;
        Node current = head;
        Node c = null;

        while (current != null) {

            c = current;
            current.next = current.prev;
            current.prev = c.next;
            current = c.next;
            previous = c;

        }

    }

    public static void printList() {
        Node temp = head;
        while (temp != null) {

            System.out.print("-->" + temp.data);
            temp = temp.next;


        }

    }

}

class Node {
    Node next = null;
    Node prev = null;
    int data = 0;


    public Node() {

    }

    public Node(int d, Node p, Node n) {
        next = n;
        prev = p;
        data = d;
    }

    public void setNext(Node ne) {
        next = ne;

    }

    public void setPrev(Node pr) {
        prev = pr;

    }

    public void setData(int da) {
        data = da;

    }

}


