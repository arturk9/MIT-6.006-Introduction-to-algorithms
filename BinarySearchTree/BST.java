package BinarySearchTree;

public class BST {
    /* A binary search tree. */
    private BSTNode root;

    @Override
    public String toString(){
        return root.getKey() + "";
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

    public BSTNode delete(int key){
        /* Deletes and returns a node with key k, if it exists, from the BST.
         * @param the key of the node that we want to delete
         * @return the deleted node that we want to delete
         * */
         BSTNode node = this.find(key);

        if(node == null)
            return null;

        if(node == root) {
            BSTNode pseudoroot = new BSTNode(null, 0);
            pseudoroot.setLeft(this.root);
            this.root.setParent(this.root);
            BSTNode deleted = this.root.delete();
            root = pseudoroot.getLeft();
            if (root != null)
                root.setParent(null);
            return deleted;
        }

        else
            return node.delete();
    }

    public BSTNode next_larger(int key){
        /* Returns the node that contains the next larger (the successor) key in the BST
         * in relation to the node with key k.
         * @param the key of the node of which the successor is to be found
         * @return the successor node.
         * */

        BSTNode node = find(key);
        return node.next_larger();
    }
}


