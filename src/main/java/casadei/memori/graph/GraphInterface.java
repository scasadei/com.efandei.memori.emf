package casadei.memori.graph;

public interface GraphInterface {

	IntNodeInterface intView();
	IntvecNodeInterface intvecView();
	JavaNodeInterface objectView();

	// I don't think I will ever use this
	<T> NodeInterface<T> getGraphView();

	<T> int getPhylum(T ni);
	
	Graph getGraph();
	
}
