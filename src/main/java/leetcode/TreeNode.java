package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    /**
     * 通过层序遍历创建二叉树
     */
    public TreeNode(Integer... a) {
        if (a.length <= 0)
            return;
        Queue<Integer> input = new LinkedList<>();
        for (Integer val : a) {
            input.offer(val);
        }
        Queue<TreeNode> queue = new LinkedList<>();
        this.val = input.poll();
        queue.offer(this);
        while (!input.isEmpty()) {
            TreeNode node = queue.poll();
            Integer leftVal = input.poll();
            if (leftVal != null) {
                node.left = new TreeNode(leftVal);
                queue.offer(node.left);
            }
            Integer rightVal = input.poll();
            if (rightVal != null) {
                node.right = new TreeNode(rightVal);
                queue.offer(node.right);
            }
        }
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }

}