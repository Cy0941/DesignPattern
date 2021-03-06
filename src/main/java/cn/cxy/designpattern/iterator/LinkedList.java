package cn.cxy.designpattern.iterator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Function: TODO Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/17 12:21 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
@Setter
@Getter
public class LinkedList implements Collection {

	private Node first = null;
	private Node tail = null;
	private int size;

	public void add(Object e) {
		Node node = new Node(e, null);
		if (null == first) {
			first = tail = node;
		} else {
			tail.setNext(node);
			tail = node;
		}
		size++;
	}

	public int size() {
		return size;
	}

	@NoArgsConstructor
	@AllArgsConstructor
	@Setter
	@Getter
	private static class Node {
		private Object data;
		private Node next;
	}

	@Override
	public Iterator iterator() {
		return new LinkedListIterator();
	}

	private class LinkedListIterator implements Iterator {

		int index = 0;

		@Override
		public boolean hasNext() {
			if (index == size) {
				return false;
			}
			return true;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return null;
		}

	}

}
