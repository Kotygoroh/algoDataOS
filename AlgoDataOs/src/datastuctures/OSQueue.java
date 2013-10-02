/**
 * 
 */
package datastuctures;

import datastuctures.Stack;

/**
 * @author ps
 *
 */
public class OSQueue<E> implements Queue<E> {

	private final int n = 64; // buffer length
	// instance variables
	@SuppressWarnings("unchecked")
	private E[] stor = (E[]) new Object[n];
	private int size;
	private int pointer;

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Queue<String> s = new OSQueue<>();
		/*
		s.push("hallo");
		s.push("hallo2");
		s.push("hallo3");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		*/	
		// System.out.println(s.pop()); should give an error 
		
	}
	private int wrapIndex(int i) {
	    int m = i % n;
	    if (m < 0) { // modulus can be negative
	        m += n;
	    }
	    return m;
	}
	@Override
	public void enqueue(E o) {
		stor[size++] = o;		
	}
	@Override
	public E dequeue() {
	    if (i < 0 || i >= n-1) throw new IndexOutOfBoundsException();

	    if(i > size()) throw new NullPointerException("Index is greater than size.");

	    return buf.get(wrapIndex(leader + i));
		return null;
	}
	@Override
	public E head() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void expand(){
		
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
