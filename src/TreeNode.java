public class TreeNode<E> {
  E value;
  TreeNode<E> left;
  TreeNode<E> right;

  public TreeNode(E data,TreeNode<E> left, TreeNode<E> right) {
    value = data;
    this.left = left;
    this.right = right;
  }
  
  public TreeNode(E data) {
    this(data, null, null);
  }

  public String getValue() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getValue'");
  }

  public TreeNode<String> getLeft() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getLeft'");
  }

  public TreeNode<String> getRight() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getRight'");
  }
}