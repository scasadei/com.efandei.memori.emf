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

		node = new NodeMethods<Integer>() {
			@Override
			boolean isNode(Integer ni) {
				return false;
			}
			@Override
			boolean isLeaf(Integer ni) {
				return false;
			}
			@Override
			int getPhylum(Integer ni) {
				return -1;
			}
			@Override
			int getGenus(Integer ni) {
				return -1;
			}
			@Override
			Object getData(Integer ni) {
				return data.get(ni);
			}
			@Override
			void print(Integer ni) {
				dataHandler.print(ni);
			}
			@Override
			public String toString(int ni) {
				return dataHandler.toString(ni);
			}
		};		
	}


	public DataType getDataType() { return dataType; }


}