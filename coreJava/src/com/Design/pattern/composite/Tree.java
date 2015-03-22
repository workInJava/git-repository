package com.Design.pattern.composite;

import java.util.Enumeration;

public class Tree {

	private TreeNode root = null;
	
	public Tree(String name){
		this.root = new TreeNode(name);
	}
	
	public static void main(String args[]){
		Tree tree = new Tree("testTree");
		TreeNode node1 = new TreeNode("node1");
		TreeNode node2 = new TreeNode("node2");
		
		node1.addChild(node2);
		tree.root.addChild(node1);
		node2.addChild(new TreeNode("node3"));
		
		Enumeration<TreeNode> k = tree.root.getChild();
		System.out.println(k.nextElement().getName()+"=================");
		
		for(Enumeration<TreeNode> e = tree.root.getChild();e.hasMoreElements();){
			System.out.println(e.nextElement().getName());
		}
	
		System.out.println("===========================");
		System.out.println("biuld Tree finished");
		
		
	}
}
