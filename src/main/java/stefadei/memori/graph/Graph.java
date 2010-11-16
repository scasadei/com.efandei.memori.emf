package stefadei.memori.graph;

// imported into eclipse

import java.util.Vector;

public abstract class Graph {

	// I don't think I will ever use this
	abstract <T> NodeInterface<T> getGraphView();


	public IntNodeInterface intNode = null;
	public IntvecNodeInterface intvecNode = null;
	public JavaNodeInterface javaNode = null;
	
	NodeMethods<?> node = null;
	
	// this is a place-holder for node-actions switched by phylum
	Vector<PhylumSwitchedNodeAction<?>> phylumSwitchedNodeActions;
	
	public IntNodeInterface intView() {
		return intNode;
	}

	// it should probably be the concrete classes to implemtent getGraph
	public Graph getGraph() { return this; }


	Object getData(int ni) { 
	return intNode.getData(ni); }
	
	// questo e un virtuosismo...
	public <T>  Object getData(T nodespec) {
		/* ... however, if getGraphView(nodespec) returns a final static member 
		*  then it's not too inefficient
		*/
		return getGraphView().getData(nodespec);
	}
	
}
