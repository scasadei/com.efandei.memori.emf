package casadei.memori.graph;

public interface NodeInterface<T> {

	boolean isNode(T ni);

	boolean isLeaf (T ni);

	int getPhylum(T ni);
	int getGenus(T ni);

	
	Object getData(T ni);
	void print(T ni);
	
}
