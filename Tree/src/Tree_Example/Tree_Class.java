package Tree_Example;

public class Tree_Class {
    Node root;

    void insert(Node r, Node n)//r is root/parent  n is new node
    {
        if (root == null)//first node
            root = n;
        else {
            if (n.data < r.data)//left
            {
                if (r.left == null)
                    r.left = n;
                else
                    insert(r.left, n);//go to left and explore
            } else {
                if (r.right == null)
                    r.right = n;
                else
                    insert(r.right, n);//go to right and explore
            }

        }
    }

    void inorder(Node r) {
        if (r != null)//LPR
        {
            inorder(r.left);//L
            System.out.print(r.data + ",");//P
            inorder(r.right);//R
        }
    }

    void preorder(Node r){
        //PLR
        if(r!=null){
            System.out.println(r.data+",");//p
            preorder(r.left);//L
            preorder(r.right);
        }
    }

    void postorder(Node r){
        //RLP
        if(r!=null){
            postorder(r.right);//R
            postorder(r.left);//L
            System.out.println(r.data+",");//P
        }
    }
    int count_node(Node r)
    {
        if(r==null)
            return 0;
        else
            return 1+count_node(r.left)+count_node(r.right);
    }

    int count_LeafNode(Node r){
        if(r.left==null && r.right==null){
            return 1;

        }
        else
            return count_LeafNode(r.left)+count_LeafNode(r.right);
    }
    int tree_value(Node r)
    {
        if(r==null)
            return 0;
        else
            return r.data+tree_value(r.left)+tree_value(r.right);
    }

    int depth(Node r){
        if(r==null)
            return  0;
        else {
            int length_left=depth(r.left);
            int length_right=depth(r.right);
            return 1+Math.max(length_left,length_right);
        }
    }

    public static void main(String[] args) {
        Tree_Class t = new Tree_Class();
        t.insert(t.root, new Node(10));
        t.insert(t.root, new Node(20));
        t.insert(t.root, new Node(5));
        t.insert(t.root, new Node(15));
        t.insert(t.root, new Node(30));
        System.out.print("\nInorder:");
        t.inorder(t.root);//5,10,15,20,30
        System.out.println();
        System.out.println(t.count_LeafNode(t.root));
        System.out.println();
        System.out.println(t.tree_value(t.root));
        System.out.println();
        System.out.println(t.depth(t.root));

    }
}