//TREE


1) BINARY TREEE - INORDER, PREODER, POSTORDER

import java.util.*;
class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int value){
        this.value=value;
        this.left=null;
        this.right=null;
    }
}
class BinaryTree{
    TreeNode root;
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }
    public void preorder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.value + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public void postorder(TreeNode root){
        if(root==null){
            return;
        }
        preorder(root.left);
        preorder(root.right);
        System.out.print(root.value + " ");
    }
}
public class Main{
    public static void main(String[]args){
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        System.out.println("Inorder Traversal");
        tree.inorder(tree.root);
        System.out.println();
         System.out.println("preorder Traversal");
        tree.preorder(tree.root);
        System.out.println();
         System.out.println("postorder Traversal");
        tree.postorder(tree.root);
        System.out.println();
    }
}
OUTPUT:

Inorder Traversal
1 2 3 
Preorder Traversal
2 1 3
Postorder Traversal
2 3 1


2) COUNT THE NODES

import java.util.*;
class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int value){
        this.value=value;
        this.left=null;
        this.right=null;
    }
}
class BinaryTree{
    TreeNode root;
    public int countnodes(TreeNode node){
        if(node==null){
            return 0;
        }
        return 1 + countnodes(node.left) + countnodes(node.right);
    }
}
public class Main{
	public static void main(String[] args) {
	   BinaryTree tree = new BinaryTree(); 
	   tree.root = new TreeNode(1);
	   tree.root.left = new TreeNode(2);
	   tree.root.right = new TreeNode(3);
	   tree.root.left.left = new TreeNode(4);
	   tree.root.left.right = new TreeNode(5);
	   tree.root.right.left = new TreeNode(6);
	   tree.root.right.right = new TreeNode(7);
	   
	   int count = tree.countnodes(tree.root);
	   
	   System.out.println("No of nodes:"+count);
	}
}


3) SUM OF LEFT NODES

import java.util.*;
class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int value){
        this.value=value;
        this.left=null;
        this.right=null;
    }
}
class BinaryTree{
    TreeNode root;
    public int countnodes(TreeNode node){
        if(node==null){
            return 0;
        }
        return 1 + countnodes(node.left) + countnodes(node.right);
    }
    public int sumOfLeftLeaves(TreeNode root){
        if(root == null){
            return 0;
        }
        int sum=0;
        if(root.left != null ){
            sum = sum + root.left.value;
        }
        sum = sum + sumOfLeftLeaves(root.left);
        sum = sum + sumOfLeftLeaves(root.right);
        
        return sum;
    }
}
public class Main{
	public static void main(String[] args) {
	   BinaryTree tree = new BinaryTree(); 
	   tree.root = new TreeNode(1);
	   tree.root.left = new TreeNode(2);
	   tree.root.right = new TreeNode(3);
	   tree.root.left.left = new TreeNode(4);
	   tree.root.left.right = new TreeNode(5);
	   tree.root.right.left = new TreeNode(6);
	   tree.root.right.right = new TreeNode(7);
	   
	   int count = tree.countnodes(tree.root);
	   int leftsum = tree.sumOfLeftLeaves(tree.root);
	   
	   System.out.println("Number of nodes in the tree:"+count);
	   System.out.println("Sum of left node:"+leftsum);
	  
	}
}


4) SUM OF RIGHT NODES


import java.util.*;
class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int value){
        this.value=value;
        this.left=null;
        this.right=null;
    }
}
class BinaryTree{
    TreeNode root;
    public int countnodes(TreeNode node){
        if(node==null){
            return 0;
        }
        return 1 + countnodes(node.left) + countnodes(node.right);
    }
    public int sumOfLeftLeaves(TreeNode root){
        if(root == null){
            return 0;
        }
        int sum=0;
        if(root.left != null ){
            sum = sum + root.left.value;
        }
        sum = sum + sumOfLeftLeaves(root.left);
        sum = sum + sumOfLeftLeaves(root.right);
        
        return sum;
    }
    public int sumOfRightLeaves(TreeNode root){
        if(root==null){
            return 0;
        }
        int sum1 =0;
        if(root.right != null){
            sum1 = sum1 + root.right.value;
        }
        sum1 = sum1 + sumOfRightLeaves(root.right);
        sum1 = sum1 + sumOfRightLeaves(root.left);
        
        return sum1;
    }
}
public class Main{
	public static void main(String[] args) {
	   BinaryTree tree = new BinaryTree(); 
	   tree.root = new TreeNode(1);
	   tree.root.left = new TreeNode(2);
	   tree.root.right = new TreeNode(3);
	   tree.root.left.left = new TreeNode(4);
	   tree.root.left.right = new TreeNode(5);
	   tree.root.right.left = new TreeNode(6);
	   tree.root.right.right = new TreeNode(7);
	   
	   int count = tree.countnodes(tree.root);
	   int leftsum = tree.sumOfLeftLeaves(tree.root);
	   int rightsum = tree.sumOfRightLeaves(tree.root);
	   
	   System.out.println("Number of nodes in the tree:"+count);
	   System.out.println("Sum of left node:"+leftsum);
	   System.out.println("Sum of right node:"+rightsum);
	}
}


5) SUM OF ALL NODES

import java.util.*;
class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int value){
        this.value=value;
        this.left=null;
        this.right=null;
    }
}
class BinaryTree{
    TreeNode root;
    public int countnodes(TreeNode node){
        if(node==null){
            return 0;
        }
        return 1 + countnodes(node.left) + countnodes(node.right);
    }
    public int sumOfAllNodes(TreeNode node){
        if(node == null){
            return 0;
        }
        return node.value + sumOfAllNodes(node.left) + sumOfAllNodes(node.right);
    }
    public int sumOfLeftLeaves(TreeNode root){
        if(root == null){
            return 0;
        }
        int sum=0;
        if(root.left != null ){
            sum = sum + root.left.value;
        }
        sum = sum + sumOfLeftLeaves(root.left);
        sum = sum + sumOfLeftLeaves(root.right);
        
        return sum;
    }
    public int sumOfRightLeaves(TreeNode root){
        if(root==null){
            return 0;
        }
        int sum1 =0;
        if(root.right != null){
            sum1 = sum1 + root.right.value;
        }
        sum1 = sum1 + sumOfRightLeaves(root.right);
        sum1 = sum1 + sumOfRightLeaves(root.left);
        
        return sum1;
    }
}
public class Main{
	public static void main(String[] args) {
	   BinaryTree tree = new BinaryTree(); 
	   tree.root = new TreeNode(1);
	   tree.root.left = new TreeNode(2);
	   tree.root.right = new TreeNode(3);
	   tree.root.left.left = new TreeNode(4);
	   tree.root.left.right = new TreeNode(5);
	   tree.root.right.left = new TreeNode(6);
	   tree.root.right.right = new TreeNode(7);
	   
	   int count = tree.countnodes(tree.root);
	   int totalsum = tree.sumOfAllNodes(tree.root);
	   int leftsum = tree.sumOfLeftLeaves(tree.root);
	   int rightsum = tree.sumOfRightLeaves(tree.root);
	   
	   System.out.println("Number of nodes in the tree:"+count);
	   System.out.println("Sum of all nodes:"+totalsum);
	   System.out.println("Sum of left node:"+leftsum);
	   System.out.println("Sum of right node:"+rightsum);
	   
	}
}

6) HEIGHT OF THE TREE

import java.util.*;
class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int value){
        this.value=value;
        this.left=null;
        this.right=null;
    }
}
class BinaryTree{
    TreeNode root;
    public int countnodes(TreeNode node){
        if(node==null){
            return 0;
        }
        return 1 + countnodes(node.left) + countnodes(node.right);
    }
    public int sumOfAllNodes(TreeNode node){
        if(node == null){
            return 0;
        }
        return node.value + sumOfAllNodes(node.left) + sumOfAllNodes(node.right);
    }
    public int sumOfLeftLeaves(TreeNode root){
        if(root == null){
            return 0;
        }
        int sum=0;
        if(root.left != null ){
            sum = sum + root.left.value;
        }
        sum = sum + sumOfLeftLeaves(root.left);
        sum = sum + sumOfLeftLeaves(root.right);
        
        return sum;
    }
    public int sumOfRightLeaves(TreeNode root){
        if(root==null){
            return 0;
        }
        int sum1 =0;
        if(root.right != null){
            sum1 = sum1 + root.right.value;
        }
        sum1 = sum1 + sumOfRightLeaves(root.right);
        sum1 = sum1 + sumOfRightLeaves(root.left);
        
        return sum1;
    }
    public int height(TreeNode root){
        if(root==null){
            return -1;
        }
        int leftheight=height(root.left);
        int rigthheight=height(root.right);
        return 1 + Math.max(leftheight,rigthheight);
    }
}
public class Main{
	public static void main(String[] args) {
	   BinaryTree tree = new BinaryTree(); 
	   tree.root = new TreeNode(1);
	   tree.root.left = new TreeNode(2);
	   tree.root.right = new TreeNode(3);
	   tree.root.left.left = new TreeNode(4);
	   tree.root.left.right = new TreeNode(5);
	   tree.root.right.left = new TreeNode(6);
	   tree.root.right.right = new TreeNode(7);
	   
	   int count = tree.countnodes(tree.root);
	   int totalsum = tree.sumOfAllNodes(tree.root);
	   int leftsum = tree.sumOfLeftLeaves(tree.root);
	   int rightsum = tree.sumOfRightLeaves(tree.root);
	   int heighttree = tree.height(tree.root);
	   
	   System.out.println("Number of nodes in the tree:"+count);
	   System.out.println("Sum of all nodes:"+totalsum);
	   System.out.println("Sum of left node:"+leftsum);
	   System.out.println("Sum of right node:"+rightsum);
	   System.out.println("Height of the tree:"+heighttree);
	   
	}
}

7) DEPTH OF THE TREE

import java.util.*;
class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int value){
        this.value=value;
        this.left=null;
        this.right=null;
    }
}
class BinaryTree{
    TreeNode root;
    public int countnodes(TreeNode node){
        if(node==null){
            return 0;
        }
        return 1 + countnodes(node.left) + countnodes(node.right);
    }
    public int sumOfAllNodes(TreeNode node){
        if(node == null){
            return 0;
        }
        return node.value + sumOfAllNodes(node.left) + sumOfAllNodes(node.right);
    }
    public int sumOfLeftLeaves(TreeNode root){
        if(root == null){
            return 0;
        }
        int sum=0;
        if(root.left != null ){
            sum = sum + root.left.value;
        }
        sum = sum + sumOfLeftLeaves(root.left);
        sum = sum + sumOfLeftLeaves(root.right);
        
        return sum;
    }
    public int sumOfRightLeaves(TreeNode root){
        if(root==null){
            return 0;
        }
        int sum1 =0;
        if(root.right != null){
            sum1 = sum1 + root.right.value;
        }
        sum1 = sum1 + sumOfRightLeaves(root.right);
        sum1 = sum1 + sumOfRightLeaves(root.left);
        
        return sum1;
    }
    public int height(TreeNode root){
        if(root==null){
            return -1;
        }
        int leftheight=height(root.left);
        int rigthheight=height(root.right);
        return 1 + Math.max(leftheight,rigthheight);
    }
    public int depth(TreeNode root){
        if(root==null){
            return -1;
        }
        int leftdepth = depth(root.left);
        int rightdepth = depth(root.right);
        return 1 +  Math.max(leftdepth,rightdepth);
    }
}
public class Main{
	public static void main(String[] args) {
	   BinaryTree tree = new BinaryTree(); 
	   tree.root = new TreeNode(1);
	   tree.root.left = new TreeNode(2);
	   tree.root.right = new TreeNode(3);
	   tree.root.left.left = new TreeNode(4);
	   tree.root.left.right = new TreeNode(5);
	   tree.root.right.left = new TreeNode(6);
	   tree.root.right.right = new TreeNode(7);
	   
	   int count = tree.countnodes(tree.root);
	   int totalsum = tree.sumOfAllNodes(tree.root);
	   int leftsum = tree.sumOfLeftLeaves(tree.root);
	   int rightsum = tree.sumOfRightLeaves(tree.root);
	   int heighttree = tree.height(tree.root);
	   int depthtree = tree.depth(tree.root);
	   
	   System.out.println("Number of nodes in the tree:"+count);
	   System.out.println("Sum of all nodes:"+totalsum);
	   System.out.println("Sum of left node:"+leftsum);
	   System.out.println("Sum of right node:"+rightsum);
	   System.out.println("Height of the tree:"+heighttree);
	   System.out.println("Depth of the tree:"+depthtree);
	   
	}
}