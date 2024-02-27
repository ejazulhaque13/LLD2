package LLD2_5_20;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Client {
    public static void main(String[] args) {
        // Practice of ArrayList,Vector,LinkList & Stack
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(1,200);
        Integer i = al.get(0);
        al.set(2,400);
        al.add(2,30);
        System.out.println(al);
        System.out.println(i);
        //Vector
        Vector<Integer> vl = new Vector<>();
        vl.add(1);
        vl.add(2);
        vl.add(3);
        System.out.println(vl);
        //Linked List
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        System.out.println(ll);
        //Stack
        Stack<Integer> st = new Stack<>();
        st.add(100);
        st.add(200);
        System.out.println(st);
        Integer i1 = st.peek();
    }
}
