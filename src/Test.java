public class Test{

    public static void main(String[] args) {
        
    }

    static int counter;
    static Tree root;
    static void createBST(int[] keys) {

        for(int key: keys){
            if(root!=null){
                insert(root, key);
            }
            else{
                root = new Tree(key);
            }
            System.out.println(counter);
        }
    }

    static void insert(Tree root, int key) {
        counter++;
        if(key<root.data) {
            if(root.left==null){
                root.left = new Tree(key);
            } else {
                insert(root.left, key);
            }
        }
        else {
            if(root.right==null){
                root.right = new Tree(key);
            } else {
                insert(root.right, key);
            }
        }
    }

    static class Tree {
        int data;
        Tree left;
        Tree right;
        Tree(int data){
            this.data = data;
        }
    }


}