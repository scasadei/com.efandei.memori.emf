package casadei.memori.graph;

public interface PhylumSwitchedNodeAction<T> {
	public Object run(Graph mg, int pi, T nodeKey);
}
