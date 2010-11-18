package casadei.memori.graph;

public abstract class NodeMethods<T> {


	abstract boolean isNode(T ni);
	abstract boolean isLeaf (T ni);
	abstract int getPhylum(T ni);
	abstract int getGenus(T ni);
	abstract Object getData(T ni);
	abstract void print(T ni);
	
	// int implementations
	
	public boolean isNode(int ni) { return false;}
	public boolean isLeaf (int ni) { return false;}
	public int getPhylum(int ni) { return -1;}
	public int getGenus(int ni)  { return -1;}
	public Object getData(int ni)  { return null;}
	public void print(int ni)  {}
	public String toString(int ni) { return "To Be Done"; }

}