package casadei.memori.graph;

public class AbstractNodeMethodsIntAccess {

	public boolean isNode(int ni) throws MethodNotImplemented { 
		throw new AbstractNodeMethodsIntAccess.MethodNotImplemented();
	}

	public boolean isLeaf (int ni) { return false;}
	public int getPhylum(int ni) { return -1;}
	public int getGenus(int ni)  { return -1;}
	public Object getData(int ni)  { return null;}
	public void print(int ni)  {}
	public String toString(int ni) { return "To Be Done"; }

	public void treatNonImplementedMethod() throws MethodNotImplemented {
		throw new AbstractNodeMethodsIntAccess.MethodNotImplemented();
	}
	
	class MethodNotImplemented extends Exception {
		private static final long serialVersionUID = 6964209639344664249L;
		MethodNotImplemented() { super(); }
		MethodNotImplemented(final String s) { super(s); }
	}
}
