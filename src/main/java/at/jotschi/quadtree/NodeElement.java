package at.jotschi.quadtree;

import java.awt.Point;

/**
 * Container class that holds the object within the quadtree
 * 
 * @author jotschi
 * 
 */
public class NodeElement<T> extends Point {

	private static final long serialVersionUID = -6818452324965717494L;

	private T element;

	/**
	 * Create a new NodeElement that holds the element at the given coordinates.
	 * 
	 * @param x
	 * @param y
	 * @param element
	 */
	public NodeElement(Point coordinates, T element) {
		super(coordinates);
		this.element = element;

	}

	/**
	 * Returns the element that is contained within this NodeElement
	 * 
	 * @return
	 */
	public T getElement() {
		return element;
	}

}