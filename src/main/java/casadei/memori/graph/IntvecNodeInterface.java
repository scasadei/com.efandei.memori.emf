package casadei.memori.graph;

public interface IntvecNodeInterface {

	boolean isNode(int [] ni);

	boolean isLeaf (int [] ni);

	int getPhylum(int [] ni);
	int getGenus(int [] ni);
	

	Object getData(int [] ni);
	void print(int [] ni);
	
}
