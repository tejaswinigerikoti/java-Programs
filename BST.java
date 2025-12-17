import java.util.*;
class Node {

    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        this.left =null ;
        this.right =null ;
    }
}
 class Binary{
    Node root;
     Node insert( Node root,int m){
        if(root==null){
            return new Node(m);
        }
        if(m<root.val){
            root.left=insert(root.left,m);
        }
        else{
            root.right=insert(root.right,m);
        }
        return root;
    }
     Node search( Node root,int key){
        if(root==null||root.val==key){
            return root;
        }
        if(key<root.val){
           return search(root.left,key);
        }
        else{
           return search(root.right,key);
        }
    }
    void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
 }
    public class BST {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Binary obj=new Binary();
        System.out.print("enter n:");
       int n=sc.nextInt();
       System.out.print("enter values:");
         for(int i=0;i<n;i++){
           int val=sc.nextInt();
              obj.root=obj.insert(obj.root,val);
    }
     System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        Node temp = obj.search(obj.root, key);
        if (temp != null) {
            System.out.println("Key " + key + " found in BST!");
            System.out.print("Subtree inorder from key " + key + ": ");
            obj.inorder(temp);
            System.out.println();
        } else {
            System.out.println("Key " + key + " not found in BST!");
        }

        System.out.println("Full BST inorder traversal:");
        obj.inorder(obj.root);
    }
}