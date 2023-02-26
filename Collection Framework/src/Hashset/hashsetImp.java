package Hashset;

import java.util.HashSet;

public class hashsetImp {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(3);
        hashSet.add(3);
        hashSet.add(9);
        System.out.println(hashSet);
    }
}
