package user.linux.lib.utils;

import java.util.*;

public class DataStructureOperations {
    public static class MyStack<T> {
        private Stack<T> stack;

        public MyStack() {
            this.stack = new Stack<>();
        }

        public void push(T item) {
            stack.push(item);
        }

        public T pop() {
            return stack.pop();
        }

        public T peek() {
            return stack.peek();
        }

        public boolean isEmpty() {
            return stack.isEmpty();
        }
    }

    public static class MyQueue<T> {
        private Queue<T> queue;

        public MyQueue() {
            this.queue = new LinkedList<>();
        }

        public void enqueue(T item) {
            queue.add(item);
        }

        public T dequeue() {
            return queue.poll();
        }

        public T peek() {
            return queue.peek();
        }

        public boolean isEmpty() {
            return queue.isEmpty();
        }
    }

    public static class MyLinkedList<T> {
        private LinkedList<T> linkedList;

        public MyLinkedList() {
            this.linkedList = new LinkedList<>();
        }

        public void add(T item) {
            linkedList.add(item);
        }

        public T get(int index) {
            return linkedList.get(index);
        }

        public void remove(int index) {
            linkedList.remove(index);
        }

        public int size() {
            return linkedList.size();
        }
    }

    public static class MyHashTable<K, V> {
        private HashMap<K, V> hashMap;

        public MyHashTable() {
            this.hashMap = new HashMap<>();
        }

        public void put(K key, V value) {
            hashMap.put(key, value);
        }

        public V get(K key) {
            return hashMap.get(key);
        }

        public void remove(K key) {
            hashMap.remove(key);
        }

        public boolean containsKey(K key) {
            return hashMap.containsKey(key);
        }
    }
}