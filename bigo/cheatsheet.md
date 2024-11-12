# BigO Notation Cheatsheet

BigO Notation is a way to determine how fast a program can run, like sorts and searches.

## Time Complexities (in order from fastest to slowest)

![Image](../assets/bigo.png)

### `O(1)`

This is instant time. This includes things like:

- Math Equations
- Printing
- Accessing elements of an `Array`/`Arraylist`

### `O(log(n))`

This is essentially running a `for i loop` from `0 to n` and another `for loop` running from `i to n`. Includes things such as:

- Best / Average case `Quicksort`
- Best / Average / Worst case `Mergesort`
- Best / Average / Worst case `Heapsort`
