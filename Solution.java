import java.util.*;
class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // take input string
        String input_string = sc.nextLine();
        // call frequencysort function to sort the string using freq
        String ans_string = frequencySort(input_string);
        // print final string which is sotred by char
        System.out.println(ans_string);

    }
    public static String frequencySort(String s) {
        // create a map to store frequency of chars
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()){
            // put all chars in map if already present increse freq by 1 otherwise put it with freq=1
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
            			
        // make a PriorityQueue(MaxHeap) to get highest frequency charaters at front
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        // maxheap of all keys of map
        pq.addAll(map.entrySet());
 
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry e = pq.poll();
            for (int i = 0; i < (int)e.getValue(); i++) 
                sb.append(e.getKey());
        }
        // convert to string ans return it
        return sb.toString();
    }
}