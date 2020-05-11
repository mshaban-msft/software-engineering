/***********************
 * holly grail
 * https://www.geeksforgeeks.org/arraylist-in-java/
***********************/

// arrays
// ****************************
int[] numbers = {1,2,3,4,5,6,7,8};
int[] numbers = int[10];
int[3] = 2;


// arraylist, vectors
// ****************************


// linked lists
// ****************************
// https://www.geeksforgeeks.org/linked-list-in-java/
LinkedList<String> object = new LinkedList<String>();

object.add("B"); 
object.addLast("C"); 
object.addFirst("D"); 

object.remove(3); 
object.removeFirst(); 
object.removeLast(); 

// stack
// ****************************
// https://www.geeksforgeeks.org/stack-class-in-java/
Stack<String> stack = new Stack<>();
stack.push("asd");
String tmp = stacl.pop();
stack.peek();
boolean status = stack.empty();


// queue
// ****************************
// https://www.programcreek.com/2014/04/leetcode-binary-tree-level-order-traversal-java/
LinkedList<Integer> queue = new LinkedList<>();
queue.offer(55);
int number = queue.poll();


// hashmap
// ****************************
// https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/
HashMap<String, Integer> map = new HashMap<>();
map.put("vishal", 10); 
map.containsKey("vishal");
map.clear();


// sets
// ****************************
// https://www.geeksforgeeks.org/set-in-java/
Set<String> hash_Set = new HashSet<String>();
hash_Set.add("Geeks");  