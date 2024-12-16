package CollectionFramework;

public class dequeue {
}
//The Deque interface was added by Java SE 6. It extends Queue and declares the behavior of
//a double-ended queue. Double-ended queues can function as standard, first-in, first-out
//queues or as last-in, first-out stacks. Deque is a generic interface that has this declaration:
//interface Deque<E>
//Deque includes the methods push( ) and pop( ). These methods enable a Deque
//to function as a stack. Also, notice the descendingIterator( ) method. It returns an iterator that
//returns elements in reverse order. In other words, it returns an iterator that moves from the end
//of the collection to the start. A Deque implementation can be capacity-restricted, which means
//that only a limited number of elements can be added to the deque. When this is the case, an
//attempt to add an element to the deque can fail. Deque allows you to handle such a failure in
//two ways. First, methods such as addFirst( ) and addLast( ) throw an IllegalStateException if a
//capacity-restricted deque is full. Second, methods such as offerFirst( ) and offerLast( ) return
//false if the element can not be added