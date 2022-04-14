<!--(FA)FSA: Fang, Sophia, Ameer  
APCS pd06  
HW 91: DEQUE THE HALLS
2022-04-13  
time spent: 0.7 hrs  
-->
## To-Do List (Utilize LinkedList)

- size()
    - Returns the size of the deque—list
- addLast(x)
    - Inserts the specified element at the end of the list
- removeFirst()
    - Retrieves and removes the first element of the list
- peekFirst()
    - Retrieves, but does not remove, the first element of the list; returns null if this deque is empty
- isEmpty()
    - Returns true if the list is empty, otherwise returns false
- addFirst()
    - Inserts the specified element at the front of the list
- removeLast()
    - Retrieves and removes the last element of the list
- peekLast()
    - Retrieves, but does not remove, the last element of the list; returns null if this deque is empty


## Design Decisions

- Due to piazza traffic, we realzied that LinkedList and Deque have very similar functionality, so using LinkedList as our implementation would help us pass through methods.
- There were also other methods mentioned inside of the implementation of Deque according to Java API, but some of these methods felt unnecessary