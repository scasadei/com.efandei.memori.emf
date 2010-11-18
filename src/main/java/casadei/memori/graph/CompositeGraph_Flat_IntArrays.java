package casadei.memori.graph;

import java.util.Vector;

public class CompositeGraph_Flat_IntArrays extends Graph {

	private Vector<Graph> subgraphs;
	
	public CompositeGraph_Flat_IntArrays() {
		intNode = new IntNodeInterface() {
			
			/*
			 * This class represents a flat graph structure (for now, at least)
			 * That is, each subgraph is a primitive graph type
			 */

			private int [] pi2mi; // phylum to memory(/graph/store)
			private int [] ni2pi;
			private int [] ni2si;
			
			@Override
			public Object getData(int ni) {
				int pi = getPhylum(ni);
				int di = ni2si[ni];
				int submi = pi2mi[pi];
				Graph subm = subgraphs.get(submi);
				return subm.intNode.getData(di);
			}

			@Override
			public int getSpecies(int ni) {
				// Phylum and Species coincide
				return ni2pi[ni];
			}

			@Override
			public int getPhylum(int ni) {
				// Phylum and Species coincide
				return ni2pi[ni];
			}

			@Override
			public boolean isLeaf(int ni) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isNode(int ni) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void print(int ni) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public int getSubkey(int ni) {
				return ni2si[ni];
			}

			@Override
			public String toString(int ni) {
				// TODO Auto-generated method stub
				return null;
			}};
	}
	

	@Override
	public <T> NodeInterface<T> getGraphView() {
		// TODO Auto-generated method stub
		return null;
	}


}
