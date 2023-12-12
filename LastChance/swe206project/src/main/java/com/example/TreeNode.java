package com.example;

class TreeNode {
    int key;
    String[] data;
    TreeNode left, right;

    public TreeNode(int key, String[] data) {
        this.key = key;
        this.data = data.clone();
        this.left = this.right = null;
    }
}




