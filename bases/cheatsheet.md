# Number Bases Cheatsheet

- [Number Bases Cheatsheet](#number-bases-cheatsheet)
  - [Common Bases](#common-bases)
  - [Letter Representations](#letter-representations)
  - [Converting Between Bases](#converting-between-bases)
  - [Base Prefixes](#base-prefixes)

## Common Bases

| Base #  |     |     |        |       |      |     |     |     |
| ------- | --- | --- | ------ | ----- | ---- | --- | --- | --- |
| Base 2  | 128 | 64  | 32     | 16    | 8    | 4   | 2   | 1   |
| Base 8  |     |     | 32768  | 4096  | 512  | 64  | 8   | 1   |
| Base 10 |     |     | 100000 | 10000 | 1000 | 100 | 10  | 1   |
| Base 16 |     |     |        |       | 4096 | 256 | 16  | 1   |

## Letter Representations

| `A` | `B` | `C` | `D` | `E` | `F` |
| --- | --- | --- | --- | --- | --- |
| 10  | 11  | 12  | 13  | 14  | 15  |

## Converting Between Bases

- Can only only convert between bases that is a power of that base
- Split into block sizes, where `x` is the original base, and `y` is the base to convert to:
  - Converting to higher base: `logₓ(y)`
  - Converting to lower base: `ʸ√x`
- Blocks form from right to left.
- When converting to a higher base:
  - Take each block to base `10`, then put them together.
- When converting to a lower base:
  - Take each block and make it into the base you are converting to.
  - If necessary, pad each block to the size it must be
  
## Java Function

| Function Name | Parameter list | Parameter #1 | Parameter #2 | Return |
|-|-|-|-|-|
| `Integer.toString()` | `num, radix` | Number in base 10 | Base to convert to | Converted Number as a string |
| `Integer.toBinaryString()` | `num` | Number in base 10 |  | Converted Number in Base 2 as a string |

## Base Prefixes

| Base | Prefix |
| ---- | ------ |
| `2`  | `0b`   |
| `8`  | `0`    |
| `16` | `0x`   |
