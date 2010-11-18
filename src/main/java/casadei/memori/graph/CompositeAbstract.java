package casadei.memori.graph;

import java.util.Vector;

public abstract class CompositeAbstract extends Graph {

	private Vector<Graph> subgraphs;
	
	public Graph mi2graph(int mi) { return subgraphs.get(mi); }
	
	public CompositeAbstract() {
		intNode = new IntNodeInterface() {
			
			
			private int [] pi2mi; // phylum to memory(/graph/store)
			private int [] ni2pi;
			private int [] ni2si;

			@Override
			public String toString(int ni) {
				return null;
			}
			
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
			}};
	}
	

	@Override
	public <T> NodeInterface<T> getGraphView() {
		// TODO Auto-generated method stub
		return null;
	}


}
