package casadei.memori.graph;
import java.util.Vector;

/*
 * This class represents a flat graph structure (for now, at least)
 * That is, each subgraph is a primitive graph type
 */


public class CompositeGraph extends Graph {

	private Vector<Graph> components;
	
	public Graph mi2graph(int mi) { return components.get(mi); }
	
	class NodeMethodsIntAccess extends AbstractNodeMethodsIntAccess {
		
		
		private int [] pi2mi; // kind-root to component (was phylum to memory item)
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
			Graph subm = components.get(submi);
			return subm.inode().getData(di);
		}

		@Override
		public int getPhylum(int ni) {
			// Phylum and Species coincide
			return ni2pi[ni];
		}

		@Override
		public boolean isLeaf(int ni) {
			return false;
		}

		@Override
		public boolean isNode(int ni) {
			return false;
		}

		@Override
		public void print(int ni) {
		}

		public int getSubkey(int ni) {
			return ni2si[ni];
		}
	};

	public <T> CompositeGraph() {
		inode = new NodeMethodsIntAccess();
	}
	
	
}
