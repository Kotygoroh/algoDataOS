/**
 * 
 */
package datastuctures;

import datastuctures.Stack;

/**
 * @author ps
 *
 */
public class MyStack<E> implements Stack<E> {

	// instance variables
	private E[] stor = (E[]) new Object[64];
	private int p;

	
	/* (non-Javadoc)
	 * @see examples.Stack#push(java.lang.Object)
	 */
	@Override
	public void push(E o) {
		stor[p++]=o;
	}
	/* (non-Javadoc)
	 * @see examples.Stack#pop()
	 */
	@Override
	public E pop() {
		return stor[--p];
	}
	/* (non-Javadoc)
	 * @see examples.Stack#top()
	 */
	@Override
	public E top() {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see examples.Stack#size()
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	/* (non-Javadoc)
	 * @see examples.Stack#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<String> s = new OSStack<>();
		s.push("hallo");
		s.push("hallo2");
		s.push("hallo3");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		// System.out.println(s.pop()); should give anerror 
		
	}

}
