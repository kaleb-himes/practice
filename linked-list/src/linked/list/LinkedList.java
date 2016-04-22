/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked.list;

import java.lang.*;

/**
 *
 * @author khimes
 */
public class LinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        unit_test();
    }
    
    private static void unit_test() {
        node a = new node();
        node b = new node();
        node c = new node();
        node d = new node();
        node e = new node();
        a.create("a");
        b.create("b");
        c.create("c");
        d.create("d");
        e.create("e");
        a.append(a, b);
        b.append(b, c);
        c.append(c, d);
        d.append(d, e);
        a.get_next();
        a.get_previous();
        b.get_next();
        b.get_previous();
        c.get_next();
        c.get_previous();
        d.get_next();
        d.get_previous();
        e.get_next();
        e.get_previous();
        c.remove();
        b.get_next();
        b.get_previous();
        d.get_next();
        d.get_previous();
        d.remove();
        a.remove();
        b.get_previous();
        b.get_next();
        a.get_next();
        a.get_previous();
        c.get_next();
        c.get_previous();
        e.remove();
        b.get_next();
        b.get_previous();
    }
    
}

class node {
    
    node next;
    node previous;
    String name;
    
    public int create(String name) {
        this.name = name;
        return 0;
    }
    
    public int append(node a, node b) throws java.lang.NullPointerException {
        a.next = b;
        b.previous = a;
        return 0;
    }
    
    public int remove() {
        System.out.println("\nRemoving node: " + this.name + "\n");
        /* Case when Node is between two other nodes*/
        if (this.previous != null && this.next != null) {
            this.next.previous = this.previous;
            this.previous.next = this.next;
            this.previous = null;
            this.next = null;
            this.name = null;
        /* Case when Node is the Tail */
        } else if (this.previous != null && this.next == null) {
            this.previous.next = null;
            this.previous = null;
            this.name = null;
        /* Case when Node is the Head */
        } else if (this.previous == null && this.next != null) {
            this.next.previous = null;
            this.next = null;
            this.name = null;
        /* Case when Node is both Head and Tail (1 item in the list) */    
        } else if (this.previous == null && this.next == null) {
            this.name = null;
        }
        
        return 0;
    }
    
    public void get_next() {
        if (this.next != null) {
            System.out.println("next of     " + this.name + " = " + this.next.name);
        } else {
            System.out.println(this.name + " is the tail");
        }
    }
    
    public void get_previous() {
        if (this.previous != null) {
            System.out.println("previous of " + this.name + " = " + this.previous.name);
        } else {
            System.out.println(this.name + " is the head");
        }
        
    }
}
