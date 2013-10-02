/**
 * 
 */
package datastuctures;

/**
 * @author os
 *
 */
public class OSLinkedQueue<E> implements Queue<E> {

	private class Node {
		E data;
		Node next;
	}
	Node first;
	Node last;
	
	/* (non-Javadoc)
	 * @see datastuctures.Queue#enqueue(java.lang.Object)
	 */
	@Override
	public void enqueue(E o) {
		Node n = new Node();
		n.data = o;
		if (last == null) {
			last = n;
			}
		else{
			last.next = n;
			last = n;
		}
		if (first == null) first = last;
	}

	/* (non-Javadoc)
	 * @see datastuctures.Queue#dequeue()
	 */
	@Override
	public E dequeue() {
		E result = first.data;
		first  = first.next;				
		return result;
	}

	/* (non-Javadoc)
	 * @see datastuctures.Queue#head()
	 */
	@Override
	public E head() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see datastuctures.Queue#size()
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see datastuctures.Queue#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	public static void main(String[] args) {
		Queue<String> q = new OSLinkedQueue<>();
		q.enqueue("hello");
		q.enqueue("hello1");
		q.enqueue("hello2");
		q.enqueue("hello3");
		q.enqueue("hello4");	
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
			
		// System.out.println(s.pop()); should give an error 
		
	}
}
