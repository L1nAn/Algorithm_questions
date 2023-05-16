/**
 * author :马治伟
 * version :1.0
 * Date : 2023/5/16 13:57
 */
public class Node_ {
    public int val;
    public Node_ left;
    public Node_ right;
    public Node_ next;

    public Node_() {
    }

    public Node_(int _val) {
        val = _val;
    }

    public Node_(int _val, Node_ _left, Node_ _right, Node_ _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
