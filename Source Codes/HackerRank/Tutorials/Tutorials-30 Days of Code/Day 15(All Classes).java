import java.io.*;
import java.util.*;
class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

import java.util.*;
class Solution {
    public static Node insert(Node head,int data){
        Node node=new Node(data);
        Node current = head;
        if(head==null){return node;}
        else{
        while(null!=current.next){current=current.next;}
        current.next=node;
        return head;
        }
    }
    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        System.out.println("Enter the number of Elements and the Elements:");
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}