package casadei.memori.graph;

public interface JavaNodeInterface {

	boolean isNode(Object no);

	boolean isLeaf (Object no);

	int getPhylum(Object no);
	int getGenus(Object no);

	Object getData(Object no);
	void print(Object no);
	
}
