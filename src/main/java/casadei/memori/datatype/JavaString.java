package casadei.memori.datatype;

import casadei.memori.graph.Graph;

public class JavaString extends casadei.memori.graph.DataType{

	public static final JavaString INSTANCE = new JavaString ();
	
	private JavaString() {}
	

	@Override
	public int dataTypeInteger() {
		return -1;
	}

	@Override
	public String dataTypeName() {
		return "JavaString2";
	}

	@Override
	protected Handler makeHandler(Graph aGraph) {
		return new StringHandler(aGraph);
		/*
		 * ALTERNATIVE FORM WITH ANONYMOUS CLASS
		return new memori.graph.DataType.Handler(aGraph) {
			@Override
			public void print(int ni) {
				System.out.println(super.graph.intNode.getData(ni));
			}
		};
		*/
	};
	
	public class StringHandler extends casadei.memori.graph.DataType.Handler {
		
		public StringHandler(Graph aGraph) { super(aGraph); }
		
		@Override
		public void print(int ni) {
			System.out.println(super.graph.node().getData(ni));
		}

		@Override
		public void printData(Object aString) {
			System.out.println((String) aString);
		}

		@Override
		public String toString(int ni) {
			// TODO Auto-generated method stub
			return (String) super.graph.node().getData(ni);
		}
		
	}
}
