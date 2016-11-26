package BinarySearchTree;

import java.util.Comparator;

public class BSTNode{
    /* A node in vanilla Binary Search Tree */

    int key;
    BSTNode parent;
    BSTNode left;
    BSTNode right;

    @Override
    public boolean equals(Object o){
        if(o instanceof BSTNode){

            BSTNode node = (BSTNode) o;

            if((this.key == node.key) && (this.parent == node.parent) && (this.left == node.left) && (this.right == node.right))
                 return true;
            else
                return false;
        }
        else
            return false;
    }

    @Override
    public String toString(){
        return "Key: " + key + "\n Parent: " + parent + "\n Left and right: " + left + " " + right;
    }

    public BSTNode(BSTNode parent, int key){
        /* Creates a node
         * @param parent node
         * @param key */

        this.parent = parent;
        this.key = key;
    }

    public BSTNode find(int key){
        /* Finds and returns the node with key from the subtree rooted at this node.
         * @param The key of the node we want to find.
         * @return BSTNode if exist, else returns null */

        if(key == this.key)
            return this;

        else if(key < this.key){
            if(this.left==null)
                return null;
            else
                return this.left.find(key);
        }
        else{
            if(this.right == null)
                return null;
            else
                return this.right.find(key);
        }
    }

    public BSTNode find_min(){
        /* Finds the node with the minimum key in the subtree rooted at this node.
         * @return the node with the minimum key */

        BSTNode current = this;

        while(current.left != null){
            current = current.left;
        }
        return current;
    }

    public BSTNode next_larger(){
        /* @return the node with the next larger key (the successor) in the BinarySearchTree. */

        BSTNode current = this;

        if(this.right != null)
            return this.right.find_min();

        while((current.parent != null) & (current.equals(current.parent.right))){
            current = current.parent;
        }
        return current.parent;
    }

    public void insert(BSTNode node){
        /* Inserts a node into the subtree rooted at this node.
         * @param the node to be inserted */

        if(node == null)
            return;

        if(node.key < this.key){
            if(this.left == null){
                node.parent = this;
                this.left = node;
            }

            else
                this.left.insert(node);
        }

        else{
            if(this.right == null){
                node.parent = this;
                this.right = node;
            }

            else
                this.right.insert(node);
        }
    }

    public BSTNode delete(){
        /* Deletes and returns this node from the BST */

        if((this.left == null) || (this.right == null)){
            if(this.equals(this.parent.left)){
                this.parent.left = this.left;
                if(this.parent.left != null)
                    this.parent.left.parent = this.parent;}
            else{
                this.parent.right = this.right;
                if(this.parent.right != null)
                    this.parent.right.parent = this.parent;}
            return this;
            }
        else{
            BSTNode s = this.next_larger();
            int tmp = Integer.valueOf(this.key);

            this.key = s.key;
            s.key = tmp;
            return s.delete();
        }
    }
}


