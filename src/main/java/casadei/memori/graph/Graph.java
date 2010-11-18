package casadei.memori.graph;

// imported into eclipse

import java.util.Vector;

public class Graph {

	final NodeMethods<?> node;
	
	Graph(NodeMethods<?> arg) {
		node = arg;
	}
	
	// this is a place-holder for node methods switched by kind
	Vector<KindSwitchedNodeMethod<?>> kindSwitchedNodeMethods;
	
	// it should probably be the concrete classes to implemtent getGraph
	public Graph getGraph() { return this; }

	public NodeMethods<?> node() { return node; }
}
