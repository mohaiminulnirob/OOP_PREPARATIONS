package CollectionFramework;

public class queue {
}
//The Queue interface extends Collection and declares the behavior of a queue, which is often a
//first-in, first-out list. However, there are types of queues in which the ordering is based upon
//other criteria. Queue is a generic interface that has this declaration:
//interface Queue<E>
//Despite its simplicity, Queue offers several points of interest. First, elements can only be
//removed from the head of the queue. Second, there are two methods that obtain and remove
//elements: poll( ) and remove( ). The difference between them is that poll( ) returns null if the
//queue is empty, but remove( ) throws an exception. Third, there are two methods, element( )
//and peek( ), that obtain but don’t remove the element at the head of the queue. They differ
//only in that element( ) throws an exception if the queue is empty, but peek( ) returns null.
//Finally, notice that offer( ) only attempts to add an element to a queue. Because some queues
//have a fixed length and might be full, offer( ) can fail.