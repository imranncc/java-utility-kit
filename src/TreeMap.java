/* Final Exam (100 marks in total; 30% of the final score of this course)
 *
 * Question 3 (30 marks)
 *
 * The goal of this question is to use the class Node to implement a TreeMap.
 * The key of the TreeMap is an int variable and the value of the TreeMap is a String variable.
 *
 * This question contains the following tasks, please tackle each of them.
 *
 * Task 1 (6 marks): implement the setter method named "put(Integer k, String v)".
 *         This method should put a key-value pair (k,v) in the TreeMap.
 *         The TreeMap should be a binary sort tree with respect to the Integer key of each Node.
 *
 * Task 2 (6 marks): implement the getter method named "get(Integer k)".
 *         This method should get the value of the key k.
 *         If the key k does not exist in the TreeMap, then return null.
 *
 * Task 3 (6 marks): implement the method named "containsKey(Integer k)".
 *         This method should return true if the TreeMap contains the key k, otherwise it should return false.
 *
 * Task 4 (6 marks): implement the method named "remove(Integer k)".
 *         If there is a node in the TreeMap whose key is equal to k, then this method should remove the node while
 *         keeping the remaining nodes in a well-organized binary sort tree.
 *
 * Task 5 (6 marks): implement the method named "inOrderTraversal(Node root)".
 *         This method should do an inOrderTraversal of the Tree to print the key-value pair of each node in the tree.
 *
 * Note: for all the methods to implement, please feel free to modify its input arguments and return values.
 *
 * Note: for all the methods to implement, please keep the name of the methods unchanged.
 *
 * Note: please feel free to modify the following code.
 */

public class Q3_TreeMap {

    class Node{
        Integer key;
        String value;
        Node left_child;
        Node right_child;
    }

    public static void main(String[] args) {

    }
}
