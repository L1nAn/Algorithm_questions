import java.util.List;

/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/4/28
 */
class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
