public class BinaryTreeByArrayMain {
  public static void main(String[] args) {
    BinaryTreeByArray obj = new BinaryTreeByArray(10);
    obj.insert(5);
    obj.insert(10);
    obj.insert(15);
    obj.insert(20);
    obj.insert(25);
    obj.insert(30);
    obj.insert(35);
    obj.insert(40);
    obj.delete(25);
    System.out.println("levelorder Traversal");
    obj.levelordertraversal();
    System.out.println();
    System.out.println("inorder Traversal");
    obj.inorderTraversal(1);
    System.out.println();
    System.out.println("postorder Traversal");
    obj.postorderTraversal(1);
    System.out.println();
    System.out.println("preorder Traversal");
    obj.preorderTraversal(1);

  }
}
