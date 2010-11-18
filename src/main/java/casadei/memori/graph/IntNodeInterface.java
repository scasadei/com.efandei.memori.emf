package casadei.memori.graph;

public interface IntNodeInterface {

	boolean isNode(int ni);

	boolean isLeaf (int ni);

	int getPhylum(int ni);
	int getSpecies(int ni);
	int getSubkey(int ni);
	Object getData(int ni);
	void print(int ni);
	String toString(int ni);
	
}
