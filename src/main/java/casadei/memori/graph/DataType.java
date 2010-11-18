package casadei.memori.graph;

public abstract class DataType {


	protected abstract Handler makeHandler(Graph aGraph); 
	
	/*
	 * memori.graph.Datatype.Handler 
	 * (handles node action requests)
	 */
	public abstract class Handler {
		final protected Graph graph;
		public Handler() { graph=null;}
		public Handler(Graph aGraph)  {graph = aGraph;}
		abstract public void print(int ni);
		abstract public String toString(int ni);
		abstract public void printData(Object aDataItem);
	}
	

			
	
	// public void setGraph(Graph aGraph) { graph = aGraph;}
	
	public abstract String dataTypeName();
	public abstract int dataTypeInteger();

}
