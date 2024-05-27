
public class Stack<T> {

	private int size;
	private Object[] elements;
	private static int DEFAULT_CAPACITY = 16;
	
	// Constructors

	public Stack() {
		this(DEFAULT_CAPACITY );
	}
	
	public Stack(int capacity) {
		try{
			elements = new Object[capacity];
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		size = 0;	
	}

	// Methods

	public T push(T element) {
		if(size == elements.length) {
			Object[] newStack = new Object[elements.length == 0 ? DEFAULT_CAPACITY : elements.length * 2];
			
			for(int i = 0; i < elements.length; i++) {
				newStack[i] = elements[i];
			}

			elements = newStack;
		}
		elements[size++] = element;
		return element;
	}

	public T pop() {
		if(size <= 0) {	
			throw new RuntimeException("Stack is empty!!!");
		}
		return (T) elements[--size];
	}

	public T lastElement() {
		if(size <= 0) {
			throw new RuntimeException("Stack is empty!!!");
		}
		return (T) elements[size-1];
	}

	public int getSize(){
		return size;
	}

	public boolean isEmpty(){ return size == 0;}
	
}