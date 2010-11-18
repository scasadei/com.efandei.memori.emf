package casadei.memori.graph;

public abstract class NodeMethods<T> {


	abstract boolean isNode(T ni);
	abstract boolean isLeaf (T ni);
	abstract int getPhylum(T ni);
	abstract int getGenus(T ni);
	abstract Object getData(T ni);
	abstract void print(T ni);
	
	// int implementations
	
	boolean isNode(int ni) { return false;}
	boolean isLeaf (int ni) { return false;}
	int getPhylum(int ni) { return -1;}
	int getGenus(int ni)  { return -1;}
	Object getData(int ni)  { return null;}
	void print(int ni)  {}

}