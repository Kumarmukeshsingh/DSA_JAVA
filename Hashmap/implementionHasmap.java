import java.util.LinkedList;

public class implementionHasmap {
   static class myHashMap<k, v> {
      public static final int DEFAULT_CAPACATY = 4;
      public static final float DEFAULT_LOAD_FACTOR = 0.75f;

      private class Node {
         k key;
         v value;
         Node(k key, v value) {
            this.key = key;̥
            this.value = value;
         }
      }

      private int n;// the number of enter in map
      private LinkedList<Node>[] buckets;

      private void initBucket(int N) {// N = size of bucket array
         buckets = new LinkedList[N];
         for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
         }

      }

      private int HashFunc(k key) {
         int hc = key.hashCode();
         return (Math.abs(hc)) % buckets.length;
      }

      private void rhash() {
         LinkedList<Node>[] oldBuckets = buckets;
         initBucket(oldBuckets.length * 2);

         int n = 0;
         for (var bucket : oldBuckets) {
            for (var node : bucket) {
               put(node.key, node.value);
            }
         }

      }

      // traverse the ll and look for a Node with key , if found it return its index
      // otherwise it return null;
      private int searchInBucket(LinkedList<Node> ll, k key) {
         for (int i = 0; i < ll.size(); i++) {
            if (ll.get(i).key == key) {
               return i;
            }
         }
         return -1;

      }

      public int size() {
         return n;
      }

      public void put(k key, v value) {// insert and update
         int bi = HashFunc(key);
         LinkedList<Node> currBucket = buckets[bi];
         int ei = searchInBucket(currBucket, key);
         if (ei == -1) {// key does not exist we hava to insert a new node
            Node node = new Node(key, value);
            currBucket.add(node);
            n++;

         } else {// update the value

            Node currNode = currBucket.get(ei);
            currNode.value = value;
         }
         if (n >= buckets.length * DEFAULT_LOAD_FACTOR) {
            rhash();
         }

      }

      public v get(k key) {
         int bi = HashFunc(key);
         LinkedList<Node> currBucket = buckets[bi];
         int ei = searchInBucket(currBucket, key);
         if (ei != -1) {// key exist
            Node currNode = currBucket.get(ei);
            return currNode.value;
         } else {
            return null;
         }
      }

      public v remove(k key) {
         int bi = HashFunc(key);
         LinkedList<Node> currBucket = buckets[bi];
         int ei = searchInBucket(currBucket, key);
         if (ei != -1) {// key exists
            Node currNode = currBucket.get(ei);
            v val = currNode.value;
            currBucket.remove(ei);
            n--;
            return val;
         } else {
            return null;
         }
      }

   }

   public static void main(String[] args) {

      myHashMap<String, Integer> mp = new myHashMap<>();
      mp.put("a", 1);
      mp.put("b", 2);
      mp.put("c", 3);
      System.out.println(mp.size());

   }

}
