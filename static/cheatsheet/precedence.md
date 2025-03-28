# Operator Precedence

- [Operator Precedence](#operator-precedence)

## Precedence Acronym & Table

Remember the acronym **POUCMA SHREAXOR LOTAL**:

> Associativity means which part of the operation comes first.
> For example, subtraction is left-to-right, meaning the left number is subtracted from the right.
> Assignments are right-to-left, meaning the left value is set to the right expression.

| Level | Name | Operator(s) | Description | Associativity |
| ----- | ---- | ----------- | ----------- | ------------- |
| 15    | Parenthesis | `()`  <br> `[]`  <br> `new`  <br> `.`  <br> `::` | parenthesis <br> array access <br> object creation <br> member access <br> method reference | left-to-right |
| 14    | Other Unary | `++` <br> `--` <br> `!` <br> `~` <br> `++` <br> `--` | unary post-increment <br> unary post-decrement <br> unary logical NOT <br> unary bitwise NOT <br> unary post-increment <br> unary post-decrement | left-to-right (first two) <br> right-to-left (last four) |
| 13    | Casting | | | |
| 12    | Multiplication | | | |
| 11    | Addition | | | |
| 10    | Shift | | | |
| 9     | Relations | | | |
| 8     | Equality | | | |
| 7     | Bitwise AND | | | |
| 6     | Bitwise XOR | | | |
| 5     | Bitwise OR | | | |
| 4     | Logical AND | | | |
| 3     | Logical OR | | | |
| 2     | Ternary | | | |
| 1     | Assignment | | | |
| 0     | Lambda | | | |
