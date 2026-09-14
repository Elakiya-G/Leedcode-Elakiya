// Last updated: 9/14/2026, 5:12:41 PM
1import java.util.*;
2
3class RandomizedSet {
4
5    ArrayList<Integer> list;
6    HashMap<Integer, Integer> map;
7    Random random;
8
9    public RandomizedSet() {
10        list = new ArrayList<>();
11        map = new HashMap<>();
12        random = new Random();
13    }
14
15    public boolean insert(int val) {
16
17        if (map.containsKey(val)) {
18            return false;
19        }
20
21        list.add(val);
22        map.put(val, list.size() - 1);
23
24        return true;
25    }
26
27    public boolean remove(int val) {
28
29        if (!map.containsKey(val)) {
30            return false;
31        }
32
33        int index = map.get(val);
34        int lastValue = list.get(list.size() - 1);
35
36        // Move last element to the position of val
37        list.set(index, lastValue);
38
39        // Update index of last element
40        map.put(lastValue, index);
41
42        // Remove last element
43        list.remove(list.size() - 1);
44
45        // Remove val from map
46        map.remove(val);
47
48        return true;
49    }
50
51    public int getRandom() {
52        int index = random.nextInt(list.size());
53        return list.get(index);
54    }
55}