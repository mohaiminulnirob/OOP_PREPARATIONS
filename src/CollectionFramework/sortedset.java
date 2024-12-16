package CollectionFramework;

public class sortedset {
}
//The SortedSet interface extends Set and declares the behavior of a set sorted in ascending
//order. SortedSet is a generic interface that has this declaration:
//interface SortedSet<E>
//NoSuchElementException when no
//items are contained in the invoking set.
//SortedSet defines several methods that make set processing more convenient. To obtain
//the first object in the set, call first( ). To get the last element, use last( ). You can obtain a subset
//of a sorted set by calling subSet( ), specifying the first and last object in the set. If you need
//the subset that starts with the first element in the set, use headSet( ). If you want the subset
//that ends the set, use tailSet( ).