import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Definition for a binary tree node.
class BinaryTreeLevelOrder {
    public static List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> qt = new LinkedList<>();
        List<List<Integer>> travlist = new LinkedList<>();
        if(root ==null){
            return travlist;
        }
        qt.offer(root);

        while(!qt.isEmpty()){
            List<Integer> levellist = new ArrayList<>();
            int levelnum = qt.size();
            for(int i =0 ; i< levelnum; i++){

                if(qt.peek().left!= null){
                    qt.offer(qt.peek().left);
                }
                if(qt.peek().right!= null){
                    qt.offer(qt.peek().right);
                }
                levellist.add(qt.poll().val);
            }
            travlist.add(levellist);
        }

        return travlist;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(7);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(9);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(18);
        root.right.right.right = new TreeNode(19);
        root.right.right.left = new TreeNode(16);


        List<List<Integer>> reslist;
        reslist = levelOrder(root);
        for (int i =0; i< reslist.size(); i++ ){
            System.out.print("[");
            for (int j = 0 ; j< reslist.get(i).size(); j++){
                System.out.print( reslist.get(i).get(j)+ " ");
            }
            System.out.print("]" + "\n");
        }

    }
}


