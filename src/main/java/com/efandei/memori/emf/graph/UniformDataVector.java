package com.efandei.memori.emf.graph;

import java.util.Vector;

public class UniformDataVector <E> extends Graph {

	private Vector<E> data;
	private DataType dataType;
	private DataType.Handler dataHandler;


	public void addDataNode(E elem) {
		data.add(elem);
	}

	@SuppressWarnings("unchecked")
	public E getData(int ni) { return (E) inode.getData(ni); }
	
	public int size() {
		return data.size();
	}

	class GraphViewWithIntegerNodeAccess extends Graph.NodeMethodsView<Integer> {
		public GraphViewWithIntegerNodeAccess() {}
		@Override
		public Object getData(Integer ni) {
			return data.get(ni);
		}
	}
	
	public NodeMethodsView<Integer> withIntegerNodeAccess() { 
		return new GraphViewWithIntegerNodeAccess();
	}

	class NodeMethodsIntAccess extends AbstractNodeMethodsIntAccess {
		@Override
		public boolean isNode(int ni) {
			return false;
		}
		@Override
		public String toString(int ni) {
			return dataHandler.toString(ni);
		}
	}	
	
	/*
	class NodeMethods extends AbstractNodeMethods<Integer> {
		@Override
		public boolean isNode(Integer ni) {
			return false;
		}
		@Override
		public boolean isLeaf(Integer ni) {
			return false;
		}
		@Override
		public int getPhylum(Integer ni) {
			return -1;
		}
		@Override
		public int getGenus(Integer ni) {
			return -1;
		}
		@Override
		public Object getData(Integer ni) {
			return data.get(ni);
		}
		@Override
		public void print(Integer ni) {
			dataHandler.print(ni);
		}
		
	}
	*/
	
	public UniformDataVector(DataType udt) {
		inode = new NodeMethodsIntAccess();
		dataType = udt;
		dataHandler = udt.makeHandler(this);
		data = new Vector<E>();
	}


	public DataType getDataType() { return dataType; }


}