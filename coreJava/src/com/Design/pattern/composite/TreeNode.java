package com.Design.pattern.composite;

import java.util.Enumeration;
import java.util.Vector;

public class TreeNode {

	private String name;
	private TreeNode parnt;
	private Vector<TreeNode> children = new Vector<TreeNode>();
	
	public TreeNode(){
		
	}
	
	public TreeNode(String name){
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TreeNode getParnt() {
		return parnt;
	}
	public void setParnt(TreeNode parnt) {
		this.parnt = parnt;
	}
	public Vector<TreeNode> getChildren() {
		return children;
	}
	public void setChildren(Vector<TreeNode> children) {
		this.children = children;
	}
	
	//添加子节点
	public void addChild(TreeNode treeNode){
		children.add(treeNode);
	}
	
	//删除子节点
	public void deleteChild(TreeNode treeNode){
		children.remove(treeNode);
	}
	
	public Enumeration<TreeNode> getChild(){
		return children.elements();
	}
}
