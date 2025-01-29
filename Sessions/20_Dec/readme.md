# List

The list interface extends from...
...`Vector` and stack implements the list interface, that is will have all the method of the list and collection interface each of these class is design to store a list of elements that is a list of numbers, Strings or a list of OBjects this list can be operated upon for various operation usua;y perform on a collectionn of elements like arrays.

The Class `ArrayList` ans `Vector` are termed as legacy classes because they were a part of the basic java installation but ecah of these functions defined in the classes is different JAVA made them a part of collections framework to bring uniformity of operations

> functions like add get removed etc. are a part of list or collection interface which are overridden by the array list class to operate upon the contents of `ArrayList`
> an arrayLIst is created with a default dimention even we can specify its dimention while creating it but if the number of elements added are more than the dimention java automatically creates an array llist of bigger dimention, elements from the smaller array list are copied to the new array list and the new array list is assigned to the array list. ... and we start using the new array list.

> The indexOf() can be used to earch or get the position of an element in the array list. if element is found it returns its position otherwise it returns -1.

## LIkedList

In case of liskedlist adddeing a new element or deleeting it is basically insertion or deletion of node the elements are scattered in the memmory that is unlike ArrayList the are not stored in a continous block of memory.

A vector stores elements in successive memmory location in case elements are added or removed from the vector, the array expands or contracts where as in an arrayLIst, cration of new array takes place.

# Iterator

To access each element of list , we can use a position loop and use the get method or we can applyan iterator to iterate upon each element of the list. once an object of the iterator class is added to a list it has two funtions

```java
hasNext(); //returns true if there is an element in the list otherwise false
next();  // remove and returns the next element(sequentially) in the list 
```
in regular method using the loop varying the position we can jump on to any element skippting no. of elements whereas iterator will refer all elemets

? what is Iterator? is it a class or interface? 

# Stack
the stack collection implements last in first out (LIFO) that is insertion and deletion of elements takes place from one end the speciality function supported in stack class are push and pop which inserts at the end of the list and delets from the end of the list 
the function `peek()` returs the last element inserted in the stack (it does not remove the element simply gets the element) 
the funtion `search()` searches for elements and returns it not returns -1
the funtion `empty()` checks if the stack is empty or not and accordingly returns true or false

>if use the iterator or forEach method on a stack it will print or refer the elements in the top to bottom order but if we use pop in a loop it will refer the elements in the bottom to top order. we can cerate a stack of any type of elements 

# Set
## TreeSet
- TreeSet class represents the bineart seach tree data structure where each element is connected with two chind element that is on  its left or right these elements are stored in a special entity called as node were each node stores the information and the addresses of the left and the right subtrees
- when information is processed, being a nonlinear data structor, traversing of elements takes place using `inorder` traversing technique where each node the left subtree is traversed information is accessed followed by the traversing of the right sub-tree this is also a part of the hash method as storage of information depends upon the actual information whenever the traversing takes place in the inorder sequence elements are printed in the sorted order. this takes place because the elements are placed accordingly the left subtree is always containing smaller element whereas right subtree contains bigger element as compared to elements stored in the node.

> The classes of list interface maintains the order of list insertions whereas the classes of Set Interface are unordered set of element were order of insertion is neglected.
