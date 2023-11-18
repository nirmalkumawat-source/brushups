package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class JavaBrushUps {

    public void sampleDS() {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.get(0);
        arrayList.remove(0);
        arrayList.size();

        List<Integer> list = new ArrayList<>(300);
        list.size();

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.get(0);
        linkedList.remove(0);
        linkedList.size();

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.peek();
        queue.poll();
        queue.size();

        Stack<Integer> stack = new Stack<>();
        stack.add(2);
        stack.peek();
        stack.pop();
        stack.size();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(1);
        pq.peek();
        pq.poll();
        pq.size();

        PriorityQueue<Float> pq2 =
            new PriorityQueue<Float>(
                Comparator.comparingInt((p1, p2) ->  {return p1.compareTo(p2);}));

        PriorityQueue<Float> pq2 =
            new PriorityQueue<Float>(
                Comparator.comparing((p1, p2) ->  {return p1.compareTo(p2);}));

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.get(1);
        map.containsKey(1);
        map.size();
        map.remove(1);
        map.keySet();
        map.values();

        Set<String> set = new HashSet<>();



        System.currentTimeMillis();

        String s = "abc";
        s.length();
        s.charAt(0);
        s.isEmpty();
        s.toLowerCase();
        s.toUpperCase(Locale.ROOT);
        s.compareTo("zys");


        char[] chars = s.toCharArray();
        int beginIndex = 1;
        String sub1 = s.substring(beginIndex);
        int endIndex = 2;
        String sub2 = s.substring(beginIndex, endIndex);
        s.contains("ab"); //true
        s.contains("z"); // false

        String[] tokens = s.split("/");

        StringBuilder sb = new StringBuilder();
        sb.append('a');
        sb.append(1);
        sb.append("xyz");
        sb.reverse();
        sb.toString();

        String[] str = {"Abcsdf", "adsf", "asdfff"};
        List<String> list1 = Arrays.asList(str);
        LinkedList<String> linkedList1 =
            new LinkedList<>(list1);


        linkedList1.getFirst();
        linkedList1.getLast();

        linkedList1.removeFirst();
        linkedList1.removeLast();

        linkedList1.size();
        linkedList1.set(2, "trewd");

        linkedList1.addFirst("newsff");
        linkedList1.addLast("newsff");

        List<String> list3 = Arrays.asList(str);


        String str;

    }

}
