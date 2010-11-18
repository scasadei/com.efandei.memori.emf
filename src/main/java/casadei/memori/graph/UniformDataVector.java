package casadei.memori.graph;

import java.util.Vector;

public class UniformDataVector <E> extends Graph {

	private Vector<E> data;
	private DataType dataType;
	private DataType.Handler dataHandler;


	public void addDataNode(E elem) {
		data.add(elem);
	}


	public int size() {
		return data.size();
	}

	public UniformDataVector(DataType udt) {
		dataType = udt;
		dataHandler = udt.makeHandler(this);
		data = new Vector<E>();


		intNode = new IntNodeInterface() {
			
			@Override
			public Object getData(int ni) {
				// return dataType.intNode.getData(ni);
				return data.get(ni);
			}

			@Override 
			public int getSpecies(int ni) {
				return 0;
			}

			@Override
			public int getPhylum(int ni) {
				return 0;
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
				dataHandler.print(ni);
			}

			@Override
			public int getSubkey(int ni) {
				// there is no node subkey in a primitive graph
				return -1;
			}

			@Override
			public String toString(int ni) {
				return dataHandler.toString(ni);
			}
		};
		
		node = new NodeMethods<Integer>() {
			@Override
			boolean isNode(Integer ni) {
				// TODO Auto-generated method stub
				return false;
			}
			@Override
			boolean isLeaf(Integer ni) {
				// TODO Auto-generated method stub
				return false;
			}
			@Override
			int getPhylum(Integer ni) {
				// TODO Auto-generated method stub
				return 0;
			}
			@Override
			int getGenus(Integer ni) {
				// TODO Auto-generated method stub
				return 0;
			}
			@Override
			Object getData(Integer ni) {
				return null;
			}
			@Override
			void print(Integer ni) {
			}
		};		
	}


	public DataType getDataType() { return dataType; }
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> NodeInterface<T> getGraphView() {
		return 	(NodeInterface<T>) super.intNode;
	}

	public IntvecNodeInterface intvecView() {
		return null;
	}

	public JavaNodeInterface objectView() {
		return null;
	}
	
	class UniformDataVectorNodeMethods implements NodeMethods.NodeMethodIntAccess {
		
		@Override
		public Object getData(int ni) {
			// return dataType.intNode.getData(ni);
			return data.get(ni);
		}

		public int getSpecies(int ni) {
			return 0;
		}

		@Override
		public int getPhylum(int ni) {
			return 0;
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
			dataHandler.print(ni);
		}

		public int getSubkey(int ni) {
			// there is no node subkey in a primitive graph
			return -1;
		}

		public String toString(int ni) {
			return dataHandler.toString(ni);
		}

		@Override
		public int getGenus(int ni) {
			// TODO Auto-generated method stub
			return 0;
		}
	}
	

}