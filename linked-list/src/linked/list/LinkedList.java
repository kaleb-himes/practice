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
    
    public int remove() throws java.lang.NullPointerException {
        node a;
        System.out.println("\nRemoving node: " + this.name + "\n");
        if (this.previous != null) {
            a = this.previous;
            
            if (this.next != null) {
                a.next = this.next;
                this.next.previous = a;
            }
        } else if (this.next != null) {
            a = this.next;
            if (this.next.previous != null) {
                this.next.previous = a;
            }
        }

        this.previous = null;
        this.next = null;
        
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
