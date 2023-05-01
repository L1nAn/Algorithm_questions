/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/4/28
 */
class Node_1 {
    public int val;
    public Node_1 left;
    public Node_1 right;
    public Node_1 next;

    public Node_1() {
    }

    public Node_1(int _val) {
        val = _val;
    }

    public Node_1(int _val, Node_1 _left, Node_1 _right, Node_1 _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
