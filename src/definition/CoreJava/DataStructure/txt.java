***ANSWER ALL QUESTIONS BELOW***

        Why do we need data structure?
        Answer:-each Data Structure allows data to be stored in a specific manner.
        -Data structure allows efficient data search and retrieval.
        -Specific Data Structures are designed to work for specific problems;
        -it allows to manage large amount of data such as large databases and indexing services such as Hash table


        What are the various operations that can be performed on different data structures?
        Answer:Insertion: adding new record to Data structure;
        Deletion: Removing particular record from the data structure.
        Searching: Finding the location of the record in data structure.
        Sorting: Arranging records in a specific order.
        Merging: Combining the records from different data structures to single data structure.
        Traversing:Accessing and processing records .


        When would we use data structures in the real world?
        Answer:Compiler Design.
        Operating System.
        Database Management System
        Statistical analysis package
        Numerical Analysis.
        Graphics.
        Artificial Intelligence


        What is an Array?
        Answer:
        Arrays are used to store multiple values in a single variable,
        instead of declaring separate variables for each value.

        What is the difference between Array and ArrayList?
        Answer:
        Array length is fixed but ArrayList length is dynamic .
        Arrays can contain primitive and non primitive data type but ArrayList contain only non primitive data type(objects);
        Array element's can be accessed  by using an index [], ArrayList has a set of methods.


        What is a LinkedList?
        Answer:

        How is an Array different from LinkedList?
        Answer:Linked List are linear data structures where the elements are not stored in contiguous locations and
        every element is a separate object with a data part and address part.
        The elements are linked using pointers and addresses.


        What is a Queue?
        Answer:Queue represents a data structure designed to have elements inserted at the end of the queue,
        and elements removed from the beginning of the queue.

        What is a Stack (not Java memory - refers to data structure)?
        Answer:Stack is linear data structure where elements can be accessed on the basis of LIFO

        What is FIFO and LIFO?
        Answer:
        FIFO: Stands for "First In First Out" is a method in which items are processed  in the order they have been entered.
        Certain data structures like Queue and other variants of Queue uses FIFO approach for processing data.

        LIFO: Stands for "Last In First Out"  is a method for handling data structures where the first element is processed last
        and the last element is processed first. In Stack elements can be accessed on the basis of LIFO.


        Explain Big O Notation?
        Answer:
        Big O Notation is the language we use to describe the complexity of an algorithm. In other words,
        Big O Notation is the language we use for talking about how long an algorithm takes to run.
        It is how we compare the efficiency of different approaches to a problem.

        What is the best case to search an element from an array?
        Answer:
        Binary search & sorting algorithm.

        What is the worst case to search an element from an array?
        Answer: linear

        Describe what a tree data structure is?
        Answer:
        A tree is a nonlinear data structure whereas arrays, linked lists, stacks and queues are linear data structures.
        It can be empty of nodes or a tree can be a structure consisting of one node called the root and zero or one or more
        sub-trees.

        Describe what a graph data structure is?
        Answer:Graph is a non-linear data structure consisting of nodes and edges. The nodes are sometimes also referred to as
        vertices and the edges are lines or arcs that connect any two nodes in the graph. For example, in Facebook,
        each person is represented with a vertex(or node). Each node is a structure and contains information like
        person id, name, gender, locale etc.


        What is the difference between the HashTable and HashMap?
        Answer:HashTable is synchronized, HashMap is not. Therefore it makes HashMap efficient with non-threaded applications
        because unsynchronized objects perform better than synchronized objects. HashTable do not allow null keys or values
        where HashMap does allow one null key and unlimited null values.


        What are the major data structures used in the following areas : RDBMS, Network data model and Hierarchical data model
        Answer:
        RDBMS, Network data model and Hierarchical data model.
        RDBMS----->Arrays.
        Network data model----->Graph;
        Hierarchical data model-----> Tree.

        How do HashMaps work in Java? How do they store values, and when are they useful?
        Answer:HashMap implements  MAP interface it  works on the principle of Hashing. It stores elements as key-value pairs.
        Java has a hash function which called hashCode(). The hashCode() method is implemented in the Object class and therefore
        each class in Java inherits it.The hash code provides the hash value.

        What is ArrayIndexOutOfBoundsException in java? When does it occur?
        Answer:

        What are the different ways of copying an array into another array?
        Answer:ArrayIndexOutOfBoundsException is an Exception that we need to handle. it is thrown to indicate that we are trying to
        access array element with an illegal index.
        This exception is thrown when

        What is DFS and BFS?
        Answer:
        BFS(Breadth First Search) uses Queue data structure for finding the shortest path.
        BFS can be used to find single source shortest path in an unweighted graph, because in BFS,
        we reach a vertex with minimum number of edges from a source vertex.
        DFS(Depth First Search) uses Stack data structure.
        In DFS, we might traverse through more edges to reach a destination vertex from a source.

        What is Recursion?
        Answer:The process in which a function calls itself directly or indirectly is called recursion
        and the corresponding function is called as recursive function. Using recursive algorithm, certain
        problems can be solved quite easily.

        What are linear and non-linear data Structures?
        Answer:
        In linear data structure, data elements are sequentially
        connected and each element is traversable through a single run.
        In non-linear data structure, data elements are hierarchically connected and are present
        at various levels


        Outline different sorting algorithms and their time complexities:
        Bubble sort: It is a comparison algorithm. It works by repeatedly stepping
        through the list to be sorted, comparing each pair of adjacent items and swapping them
        if they are in the wrong order. The pass through the list is repeated until no swaps are
        needed, which indicates that the list is sorted.
        Worst case performance: O(n2)
        Best case performance: O(n)
        Average case performance: O(n2)
        Worst case space complexity: O(n) total, O(1) auxiliary
        Bubble sort is not a practical sorting algorithm when n is large.

        2.Selection sort: It is an in-place comparison sort.Selection sort is noted for its simplicity,
        and also has performance advantages over more complicated algorithms in certain situations.
        Worst case performance: O(n2)
        Best case performance: O(n2)
        Average case performance: O(n2)
        Worst case space complexity: O(n) total, O(1) auxiliary

        3.Insertion sort: It is a comparison sort in which the sorted array (or list) is built one entry
        at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort,
        heapsort, or merge sort.
        Worst case performance: O(n2)
        Best case performance: O(n)
        Average case performance: O(n2)
        Worst case space complexity: O(n) total, O(1) auxiliary

        4. Merge sort: It is an O(n log n) comparison-based sorting algorithm.
        Worst case performance: O(n log n)
        Best case performance: O(n log n) typical
        Average case performance: O(n log n)
        Worst case space complexity: O(n) total, O(n) auxiliary

        5.Quick sort: It is similar to merge sort in many ways. It divides the elements to be sorted into
        two groups, sorts the two groups by recursive calls, and combines the two sorted groups into
        a single array of sorted values.
        The choice of a good pivot element is critical to the efficiency of the quicksort algorithm.
        If we can ensure that the pivot element is near the median of the array values, then quicksort is very efficient.
        on average, makes O(n log n) comparisons to sort n items, in the worst case, it makes O(n2) comparisons



        Draw a table with time complexity in which it will summarize all the data structure feature's advantages and disadvantages.
        a) In terms of Accessing elements:
        b) In terms of Inserting elements:
        c) In terms of Searching elements:
        d) In terms of Removing elements:
