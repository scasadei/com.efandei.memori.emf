package com.efandei.memori.graph;

public abstract class AbstractNodeMethods<T> {


	public boolean isNode(T ni) { return false;}
	public boolean isLeaf (T ni) { return false;}
	public int getPhylum(T ni) { return -1;}
	public int getGenus(T ni) { return -1;}
	public Object getData(T ni) { return null;}
	public void print(T ni) {}
	
	
	
	// int implementations
	/*
	public boolean isNode(int ni) { return false;}
	public boolean isLeaf (int ni) { return false;}
	public int getPhylum(int ni) { return -1;}
	public int getGenus(int ni)  { return -1;}
	public Object getData(int ni)  { return null;}
	public void print(int ni)  {}
	public String toString(int ni) { return "To Be Done"; }
	*/
}