/**
 * A utility class for performing operations on a binary tree of Strings.
 */
public class QuickCheck {

  /**
   * Prints all strings longer than 7 characters in a tree.
   * The strings should be printed in pre-order.
   * Each qualifying string should appear on its own line.
   * 
   * If the node itself is null, the method should print nothing.
   * 
   * You can assume that there are no null Strings stored in the tree nodes.
   *
   * @param node the root node of the binary tree
   */
  public static void printLongerThan7(TreeNode<Integer> node) {
    // Base case: empty node
    if (node == null) return;
            
    // Pre-order processing: check current node first
    String value = node.getValue();
    if (value.length() > 7) {
        System.out.println(value);
    }
    
    // Recursively check left and right subtrees
    printLongerThan7(node.getLeft());
    printLongerThan7(node.getRight());

  }

  /**
   * Returns the sum of all nodes holding odd numbers.
   * 
   * If the node itself is null, return 0.
   * 
   * You can assume there are no null Integers held in the values.
   *
   * @param node the root node of the binary tree
   * @return the sum of all odd-valued nodes
   */
  public static int oddSum(TreeNode<Integer> node) {
      // Base case: empty node
    if (node == null) return 0;
      
    // Check if current node's value is odd
    int currentValue = node.getValue();
    int sum = (currentValue % 2 != 0) ? currentValue : 0;
    
    // Recursively sum odd values from left and right subtrees
    sum += oddSum(node.getLeft());
    sum += oddSum(node.getRight());
  
    return sum;
}
}
