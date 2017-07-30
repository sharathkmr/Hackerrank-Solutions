// https://www.hackerrank.com/challenges/30-linked-list

import java.util.Scanner;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedListDay15 {

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
	
	public static  Node insert(Node head,int data) {
        //Complete this method
        if(head == null) {
        	return new Node(data);
        } else {
        	Node n = head;
        	while(n.next != null) {
        		n = n.next;
        	}
        	n.next = new Node(data);
        	return head;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }

}