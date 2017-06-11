package com.josh.code.general4;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Munish on 6/8/17.
 */
public class PriorityQueueExample {


    public static void main(String[] args) {
        testPriorityQueue();

    }

    HashMap<Integer, Node> lru = new HashMap<Integer, Node>();


    public static void add() {


    }


    public static void testPriorityQueue() {

        Queue<Person> pq = new PriorityQueue<Person>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return (int) o1.name.compareTo(o2.name) ;
            }
        });

        pq.add(new Person("munish", 41, "14891 B Hill rd , Los Gatos, CA"));
        pq.add(new Person("deepika", 37, "14891 B Hill rd , Los Gatos, CA"));
        pq.add(new Person("ryan", 7, "14891 B Hill rd , Los Gatos, CA"));
        pq.add(new Person("arissa", 4, "14891 B Hill rd , Los Gatos, CA"));


        for (int i =0;i<4;i++) {

            System.out.println(pq.poll());
        }


    }


}


class Node {
    int value;
    Node next;
    Node prev;
}