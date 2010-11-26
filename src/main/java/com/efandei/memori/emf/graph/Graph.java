package com.efandei.memori.emf.graph;

// imported into eclipse

import org.eclipse.emf.ecore.EObject;
import java.util.Vector;

/**
 * @model kind="class" abstract="true"
 */
public abstract class Graph implements EObject {

	protected AbstractNodeMethods<?> node = null;
	protected AbstractNodeMethodsIntAccess inode = null;
	
	// Graph() {}
	// Graph(NodeMethods<?> arg) {	node = arg;	}
	
	// this is a place-holder for node methods switched by kind
	Vector<KindSwitchedNodeMethod<?>> kindSwitchedNodeMethods;
	
	 // it should probably be the concrete classes to implement getGraph
	// public Graph getGraph() { return this; }

	public AbstractNodeMethods<?> node() { return node; }
	public AbstractNodeMethodsIntAccess inode() { return inode; }
	
	// A Concrete graph may implement a Graph.View, other than the default 'node' and expose it
	// It is called a "View" because it sits on top of the graph!
	public class NodeMethodsView<T> extends AbstractNodeMethods<T> {
		NodeMethodsView () {}
		public Graph graph() { return Graph.this; }
	}
}
