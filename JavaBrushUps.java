package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class JavaBrushUps {

    // A comparator class
    class PQ_Comparator implements Comparator<String> {
        public int compare(String str1, String str2) {
            String first_Str;
            String second_Str;
            first_Str = str1;
            second_Str = str2;
            return second_Str.compareTo(first_Str);
        }
    }

    public void sampleDS() {
        // Array List
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.get(0);
        arrayList.remove(0);
        arrayList.size();

        // Initialize Array List with a fixed size
        List<Integer> list = new ArrayList<>(300);
        list.size();

        // LinkedList
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.get(0);
        linkedList.remove(0);
        linkedList.size();

        // Create a Queue as LinkedList
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.peek();
        queue.poll();
        queue.size();

        // Create a Stack as Stack
        Stack<Integer> stack = new Stack<>();
        stack.add(2);
        stack.peek();
        stack.pop();
        stack.size();

        // Create a MinHeap as PriorityQueue with Natural Ordering
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(1); // insert
        pq.peek();  // fetch top element
        pq.poll(); // remove top element
        pq.size();

        // Priority Queue with custom comparator 'PQ_Comparator' (declared above)
        PriorityQueue<String> pq2 = new PriorityQueue<String>(new PQ_Comparator());


        // Construct Map as HashMap
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.get(1);
        map.containsKey(1);
        map.size();
        map.remove(1);
        map.keySet();
        map.values();

        // Iterate through map
        // 1
        map.forEach((key, value) -> {
            System.out.println(key + " => " + value);
        });
        // 2
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + " => " + value);
        }
        // 3
        Set keys2 = map.keySet();
        for (Iterator i = keys2.iterator(); i.hasNext();) {
            Integer key = (Integer) i.next();
            Integer value =  map.get(key);
            System.out.println(key + " = " + value);
        }

        // Sorted tree map
        Map<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(1, 5);
        treeMap.put(5, 12);
        treeMap.put(2, 56);
        treeMap.get(2); // should return 56
        Set<Integer> keys = treeMap.keySet();
        treeMap.remove(5);
        treeMap.isEmpty();

        // Print key-value pair with sorted keys
        map.forEach((key, value) -> {
            System.out.println(key + " => " + value);
        });

        // Construct Set as HashSet
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(5);
        set.add(2);
        set.contains(1); // true
        set.contains(3); // false

        set.size(); // returns 3
        set.isEmpty(); // returns false

        set.remove(1);
        set.size(); // returns 2

        // Iterate through Set
        set.forEach(System.out::println);

        set.forEach((k) -> {
            System.out.println(k);
        });

        // A Sorted Set
        Set<Integer> treeSet = new TreeSet<>();

        // Current time in milliseconds
        System.currentTimeMillis();

        // Create non-empty string
        String s = "abc";
        s.length();
        s.charAt(0);
        s.isEmpty();
        s.toLowerCase();
        s.toUpperCase(Locale.ROOT);
        s.compareTo("zys");


        // Convert String to charArray
        char[] chars = s.toCharArray();
        int beginIndex = 1;
        // Subset the string
        String sub1 = s.substring(beginIndex);
        int endIndex = 2;
        String sub2 = s.substring(beginIndex, endIndex);

        s.contains("ab"); //true
        s.contains("z"); // false

        // Split the string
        String[] tokens = s.split("/");

        // Build a string
        StringBuilder sb = new StringBuilder();
        sb.append('a');
        sb.append(1);
        sb.append("xyz");
        sb.reverse();
        sb.toString();

        // An array of Strings
        String[] str = {"Abcsdf", "adsf", "asdfff"};

        // Convert array to list
        List<String> list1 = Arrays.asList(str);
        // Convert list to LinkedList
        LinkedList<String> linkedList1 =
            new LinkedList<>(list1);

        // Fetch first and last element from
        // doubly-linked list
        linkedList1.getFirst();
        linkedList1.getLast();

        // Remove first and last element
        linkedList1.removeFirst();
        linkedList1.removeLast();

        linkedList1.size();
        linkedList1.set(2, "trewd");

        linkedList1.addFirst("newsff");
        linkedList1.addLast("newsff");

        List<String> list3 = Arrays.asList(str);


    }

}
