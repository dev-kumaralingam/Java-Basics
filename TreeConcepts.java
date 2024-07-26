import java.util.Scanner;

class TreeNode {
    int value;
    TreeNode left, right;

    public TreeNode(int value) {
        this.value = value;
        left = right = null;
    }
}

class TreeConcepts {
    public TreeNode insertLevelOrder(int[] arr, TreeNode root, int i) {
        if (i < arr.length) {
            TreeNode temp = new TreeNode(arr[i]);
            root = temp;

            root.left = insertLevelOrder(arr, root.left, 2 * i + 1);
            root.right = insertLevelOrder(arr, root.right, 2 * i + 2);
        }
        return root;
    }

    public void preorderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    public void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.value + " ");
            inorderTraversal(root.right);
        }
    }

    public void postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.value + " ");
        }
    }

    public void treetraversal(TreeNode root, int choice) {
        if (choice == 1) {
            System.out.println("Preorder traversal:");
            preorderTraversal(root);
            System.out.println();
        } else if (choice == 2) {
            System.out.println("Inorder traversal:");
            inorderTraversal(root);
            System.out.println();
        } else if (choice == 3) {
            System.out.println("Postorder traversal:");
            postorderTraversal(root);
            System.out.println();
        } else {
            System.out.println("Invalid choice");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes: ");
        int n = sc.nextInt();
        System.out.println("Enter the values for nodes: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Select a Traversal: ");
        System.out.println("1. Preorder");
        System.out.println("2. Inorder");
        System.out.println("3. Postorder");
        int choice = sc.nextInt();
        sc.close();

        TreeConcepts obj = new TreeConcepts();
        TreeNode root = obj.insertLevelOrder(arr, null, 0);
        obj.treetraversal(root, choice);
    }
}
