package com.example;

import java.util.HashMap;
import java.util.Map;


public class ResearcherBST {
    private TreeNode root;

    public ResearcherBST() {
        this.root = null;
    }

    public void insert(int key, String password, String name, String major) {
        String[] data = {password, name, major};
        root = insert(root, key, data);
    }

    private TreeNode insert(TreeNode root, int key, String[] data) {
        if (root == null) {
            return new TreeNode(key, data);
        }

        if (key < root.key) {
            root.left = insert(root.left, key, data);
        } else if (key > root.key) {
            root.right = insert(root.right, key, data);
        } else {
            // Duplicate key, handle as needed
        }

        return root;
    }

    public String[] search(int key) {
        return search(root, key);
    }

    private String[] search(TreeNode root, int key) {
        if (root == null || root.key == key) {
            return root != null ? root.data : null;
        }

        if (key < root.key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    // Example usage
    
}