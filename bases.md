# Nunber Bases

## Table of Contents

1. [What is a base?](#what-is-a-base)
2. [Reading Base Numbers](#reading-base-numbers)

## What is a base?

Number bases are different ways we can represent numbers.
In our everyday life, we use base `10` to represent numbers, like in our math classes or in conversation.
A base can be written using a subscript after the number, for example `1110101₂` or `10,968₁₀`.
Computers use base `2`, otherwise known as binary for representing their data.
Other important bases to know are bases `8`, `10`, and `16`.

## Reading Base Numbers

In order to read a number (e.x. `11101011₂`), we need to assign a number to each place, such as how we have the ones and tens place for base `10`:

| 1   | 1   | 1   | 0   | 1   | 0   | 1   | 1   |
| --- | --- | --- | --- | --- | --- | --- | --- |
| 128 | 64  | 32  | 16  | 8   | 4   | 2   | 1   |

The pattern for reading the bases is to start from one on the rightmost side, then keep multiplying it by the base number (in this case `2`, till you get to the leftmost value).

In this scenario, if there is a `1` in a space, we add that number to the total.
Since there is a `1` in the space of `128`, `64`, `32`, `8`, `2`, and `1`, we add all these up to get:

`128 + 64 + 32 + 8 + 2 + 1 = 235`

Therefore, `11101011₂` in base `10` is `235`.

For other bases, such as base 8, we can do the same thing (e.x. `0631₈`):

| 0   | 6   | 3   | 1   |
| --- | --- | --- | --- |
| 512 | 64  | 8   | 1   |

Again, we start at one for the rightmost digit, then multiply by the base (`8`) going leftward.

Since we have numbers bigger than one, we can multiply the number by the digit, so there are `6 64`'s, `3 8`'s, and `1 1`.
We can add all these up to get:

`64(6) + 8(3) + 1 = 409`.

Therefore, `0631₈` in base `10` is `409`.
