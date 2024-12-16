package CollectionFramework;

public class Main {
}
//book
//The java.util package also contains one of Java’s most powerful subsystems: The Collections
//Framework. The Collections Framework is a sophisticated hierarchy of interfaces and classes
//that provide state-of-the-art technology for managing groups of objects.
//Java provided ad hoc classes such as Dictionary,
//Vector, Stack, and Properties to store and manipulate groups of objects. Although these classes
//were quite useful, they lacked a central, unifying theme. The way that you used Vector was
//different from the way that you used Properties, for example. Also, this early, ad hoc approach
//was not designed to be easily extended or adapted. Collections are an answer to these (and
//other) problems
//goals of collection framework(high performance, interoperability, provided interfaces with implementations,
//integration with standard arrays
//algorithm
//iterator
//map(not collection in strict term but collection view of map is possible)
//recent changes to collection(generics, auto boxing, for-each loop)
//collection interfaces(collection, list, queue, dequeue, set, sorted set, navigable set)
//Comparator, RandomAccess, Iterator, ListIterator
//Modifiable collection must have Optional method to modify the contents Otherwise UnsupportedOperationException will be thrown.
//The Collection interface is the foundation upon which the Collections Framework is built
//because it must be implemented by any class that defines a collection. Collection is a generic
//interface that has this declaration:
//interface Collection<E>
//collection extends iterable interface
//Recall that only classes that implements Iterable can be cycled through by the for
//ClassCastException(object is not compatible)
//NullPointerException(storing null object)
//IllegalArgumentException(adding an element to a fixed length full collection)
//add, addAll,remove, removeAll, retainAll, clear, contains, containsAll, isEmpty, size, toArray, equals, iterator
//Collection classes from book
//making a hierrarchy of collection classes