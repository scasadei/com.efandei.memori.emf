package casadei.memori.graph;

// imported into eclipse

import java.util.Vector;

public abstract class Graph {

	NodeMethods<?> node = null;
	
	// this is a place-holder for node-actions switched by phylum
	Vector<PhylumSwitchedNodeAction<?>> phylumSwitchedNodeActions;
	
	// it should probably be the concrete classes to implemtent getGraph
	public Graph getGraph() { return this; }

	public NodeMethods<?> node() { return node; }
}
