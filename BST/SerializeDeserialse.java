public class SerializeDeserialse {
    public class Codec {

    public String serialize(TreeNode root) {
        if (root == null) return "";
        return root.val + "," + serialize(root.left) + serialize(root.right);
    }

    int index = 0;

    public TreeNode deserialize(String data) {
        if (data.isEmpty()) return null;
        String[] values = data.split(",");
        return build(values, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode build(String[] values, int min, int max) {
        if (index >= values.length) return null;

        int val = Integer.parseInt(values[index]);
        if (val < min || val > max) return null;

        TreeNode root = new TreeNode(val);
        index++;

        root.left = build(values, min, val);
        root.right = build(values, val, max);
        return root;
    }
}

}
