import java.util.*;
import java.io.*;
 class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
 class Solution {
    static void levelOrder(Node root){
        Queue<Node> queue= new LinkedList<>();
        if (root != null){
            queue.add(root);
        }
        while(! queue.isEmpty()){
            Node n=queue.remove();
            System.out.print(n.data+" ");
            if (n.left != null){
                queue.add(n.left);
            }
            if(n.right != null){
                queue.add(n.right);
            }
        }
    } 
    public static Node insert(Node root,int data){
        if (root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of Digits:");
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        sc.close();
        levelOrder(root);
    }
    
}
