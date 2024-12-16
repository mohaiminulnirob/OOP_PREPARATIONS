package CollectionFramework;

public class List {
}
//The List interface extends Collection and declares the behavior of a collection that stores a
//sequence of elements. Elements can be inserted or accessed by their position in the list, using
//a zero-based index. A list may contain duplicate elements. List is a generic interface that has
//this declaration:
//interface List<E>
// IndexOutOfBoundsException
//To the versions of add( ) and addAll( ) defined by Collection, List adds the methods
//add(int, E) and addAll(int, Collection). These methods insert elements at the specified index.
//Also, the semantics of add(E) and addAll(Collection) defined by Collection are changed by
//List so that they add elements to the end of the list
//To obtain the object stored at a specific location, call get( ) with the index of the object.
//To assign a value to an element in the list, call set( ), specifying the index of the object to be
//changed. To find the index of an object, use indexOf( ) or lastIndexOf( ).
//You can obtain a sublist of a list by calling subList( ), specifying the beginning and ending
//indexes of the sublist. As you can imagine, subList( ) makes list processing quite convenient.