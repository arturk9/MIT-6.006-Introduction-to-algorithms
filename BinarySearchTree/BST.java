package BinarySearchTree;

public class BST {
    /* A binary search tree. */
    BSTNode root;

    @Override
    public String toString(){
        if(this.root == null)
            return "<empty tree>";
        else
            return root.toString();
    }

    public BST(){
        root = null;
    }

    public BSTNode find(int key){
        /* Finds and returns the node with key k from the subtree rooted at this node
         * @param The key of node we want to find
         * @return node, it exists or null if doesn't */
        return root.find(key);
    }

    public BSTNode find_min(){
        /* Returns a minimum node of this BST. */
        return root.find_min();
    }

    public BSTNode insert(int key){
        /* Inserts a node with key k into the subtree rooted at this node.
         * @param the key of the node to be inserted
         * @return the node inserted */
        BSTNode node = new BSTNode(null, key);
        if(root == null){
            root = node;
        }
        else
            root.insert(node);

        return node;
    }
}

