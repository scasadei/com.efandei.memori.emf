package casadei.memori.graph;

public interface IntegerNodeInterface {
	boolean isNode(Integer ni);
	boolean isLeaf (Integer ni);
	Integer getPhylum(Integer ni);
	Integer getSpecies(Integer ni);
	Integer getSubkey(Integer ni);
	Object getData(Integer ni);
	void print(Integer ni);
}
