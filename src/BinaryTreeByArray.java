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
  System.out.print(arr[index]+ " ");
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
  System.out.print(arr[index] + " " );
}
public void inorderTraversal(int index) {
  if (index > lastusedindex) {
    return;
  }
  preorderTraversal(index * 2);
  System.out.print(arr[index]+ " ");
  preorderTraversal(index * 2 + 1);

}
// method for level order traversal
  public  void levelordertraversal()
  {
    for(int i=1;i<=lastusedindex;i++)
    {
      System.out.print(arr[i]+ " ");
    }
  }
 // method for search a value
 // here return type of the method is int. if the value found it will return the index where it is found
  // else return -1(means value is not available);

  public int search(int value) {
    for (int i = 1; i <= lastusedindex; i++) {
      if (arr[i] == value) {
        System.out.print(value + " is available in the tree  ");

        return i;
      }
    }
    System.out.println(value+ " is not available in the tree");
    return -1;
  }

  // delete operation
  // to delete a value from the binary tree we will insert the last element of the tree at specific location
  // the discription of the method is
  // i called here search method to get the location of the value which you want to delete
  // if the value found it will return the index other wise it will return -1
  // after that override the value of that index with last index value of the tree
  public void delete(int value) {
    int location = search(value);
    //If Value does not exists in Array
    if (location == -1) {
      return;
    }else {

      arr[location] = arr[lastusedindex];
      lastusedindex--;
    }
  }//end of method
}
