// A tree node can have any no of children but in binary tree each node can have atmost two children.
// Understanding binary tree is a prerequisite for more advance trees like (BST,AVL RedBlack, Expression Tree) etc.
// Here i am writing the implementation of Binary Tree By Array
// when we want to store a tree in an array we never use the 0th cell because of mathematical complexity.
// To root node we store at the first cell
// To refer Left child we use (2 * x) here x is parent node)
// To refer Right child we use ( 2 * x + 1)
// Binary Tree common operations
// 1) creation of Tree
// 2) insertion of a node
// 3) deletion of a node
// 4) searching of a node
// 5) treaverse all nodes

public class BinaryTreeByArray {
  int arr[]; // array declaration
  int lastusedindex;
// constructor to construct blank tree
  public BinaryTreeByArray(int capacity)
  {
    arr = new int[capacity+1]; // array creation
    lastusedindex= 0;
  }
  // method to insert the value
  public void insert(int value)
  {
      if(arr.length-1 == lastusedindex)
      {
        System.out.println("list is full");
      }
      else
      {
        // you can also write
        // arr[lastusedindex+1]= value;
        // lastusedindex++;
        arr[++lastusedindex]= value;
      }
  }
// Tree Traversal
// Traversal means the process of visiting each of the nodes in a tree and examine the value stored in the node
// 1) Depth First Search
     //  a) Pre order Traversal (DLR)
     //  b) Post order Traversal(LRD)
     //  c) In order Traversal(LDR)
// 2) Breadth First Search
     // a) level Order Traversal

  public void preorderTraversal(int index)
{
  if(index>lastusedindex)
  {
    return;
  }
  System.out.println(arr[index]);
  preorderTraversal(index*2);
  preorderTraversal(index*2+1);
}
public void postorderTraversal(int index)
{
  if(index>lastusedindex)
  {
    return;
  }
  preorderTraversal(index*2);
  preorderTraversal(index*2+1);
  System.out.println(arr[index]);
}

public void inorderTraversal(int index) {
  if (index > lastusedindex) {
    return;
  }
  preorderTraversal(index * 2);
  System.out.println(arr[index]);
  preorderTraversal(index * 2 + 1);

}
}
