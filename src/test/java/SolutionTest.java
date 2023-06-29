import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Solution;
import org.example.TreeNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testSolution() {
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(1);
        root1.left.left = new TreeNode(6);
        root1.left.right = new TreeNode(2);
        root1.right.left = new TreeNode(0);
        root1.right.right = new TreeNode(8);
        root1.left.right.left = new TreeNode(7);
        root1.left.right.right = new TreeNode(4);

//                  ┌─── 3 ─────────┐
//                  |               |
//              ┌─ 5 ─┐          ┌─ 1 ─┐
//              |     |          |     |
//              6     2 ───┐     0     8
//                    |    |
//                    7    4

        TreeNode p1 = root1.getNodeByValue(5);
        TreeNode q1 = root1.getNodeByValue(1);
        assertEquals(3, Solution.lowestCommonAncestor(root1, p1, q1).val);

         p1 = root1.getNodeByValue(6);
         q1 = root1.getNodeByValue(1);
        assertEquals(3, Solution.lowestCommonAncestor(root1, p1, q1).val);

         p1 = root1.getNodeByValue(2);
         q1 = root1.getNodeByValue(8);
        assertEquals(3, Solution.lowestCommonAncestor(root1, p1, q1).val);

         p1 = root1.getNodeByValue(5);
         q1 = root1.getNodeByValue(2);
        assertEquals(5, Solution.lowestCommonAncestor(root1, p1, q1).val);

         p1 = root1.getNodeByValue(4);
         q1 = root1.getNodeByValue(7);
        assertEquals(2, Solution.lowestCommonAncestor(root1, p1, q1).val);

        p1 = root1.getNodeByValue(4);
        q1 = root1.getNodeByValue(6);
        assertEquals(5, Solution.lowestCommonAncestor(root1, p1, q1).val);

        p1 = root1.getNodeByValue(4);
        q1 = root1.getNodeByValue(5);
        assertEquals(5, Solution.lowestCommonAncestor(root1, p1, q1).val);


    }
}
