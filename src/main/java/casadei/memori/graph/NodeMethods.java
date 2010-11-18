package casadei.memori.graph;

public abstract class NodeMethods<T> {


	abstract boolean isNode(T ni);
	abstract boolean isLeaf (T ni);
	abstract int getPhylum(T ni);
	abstract int getGenus(T ni);
	abstract Object getData(T ni);
	abstract void print(T ni);
	
	// int implementations
	
	boolean isNode(int ni) { return false;}
	boolean isLeaf (int ni) { return false;}
	int getPhylum(int ni) { return -1;}
	int getGenus(int ni)  { return -1;}
	Object getData(int ni)  { return null;}
	void print(int ni)  {}

	public abstract class NodeMethodIntAccessAbstract  extends NodeMethods implements NodeMethodIntAccess {
		public abstract boolean isNode(int ni);
		public abstract boolean isLeaf (int ni);
		public abstract int getPhylum(int ni);
		public abstract int getGenus(int ni);
		public abstract Object getData(int ni);
		public abstract void print(int ni);
	}

	public class NodeMethodIntAccessConcrete {
		boolean isNode(int ni) { return false;}
		boolean isLeaf (int ni) { return false;}
		int getPhylum(int ni) { return -1;}
		int getGenus(int ni)  { return -1;}
		Object getData(int ni)  { return null;}
		void print(int ni)  {}
	}

	public interface NodeMethodIntAccess {
		boolean isNode(int ni);
		boolean isLeaf (int ni);
		int getPhylum(int ni);
		int getGenus(int ni);
		Object getData(int ni);
		void print(int ni);
	}

	public interface NodeMethodsParametricAcess<T> {
		boolean isNode(T ni);
		boolean isLeaf (T ni);
		int getPhylum(T ni);
		int getGenus(T ni);
		Object getData(T ni);
		void print(T ni);
	}

}