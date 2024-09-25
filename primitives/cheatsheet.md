# Primitives Cheatsheet

- [Primitives Cheatsheet](#primitives-cheatsheet)
  - [Primitive Types](#primitive-types)
  - [Integer Division](#integer-division)

## Primitive Types

| Name      | Bits | Signed | Range                                                    |
| --------- | ---- | ------ | -------------------------------------------------------- |
| `boolean` | `8`  | `No`   | `false` or `true`                                        |
| `byte`    | `8`  | `Yes`  | `-128` to `127`                                          |
| `char`    | `16` | `No`   | `0` to `65535`                                           |
| `short`   | `16` | `Yes`  | `-32768` to `32767`                                      |
| `int`     | `32` | `Yes`  | `-2147483648` to `2147483647`                            |
| `long`    | `64` | `Yes`  | `-9223372036854775808` to `9223372036854775807`          |
| `float`   | `32` |        | `1.40239846e-45` to `3.40282347e+38`                     |
| `double`  | `64` |        | `4.94065645841246544e-324` to `1.79769313486231570e+308` |

## Integer Division

- Division between two `number` values (`byte`, `short`, `int`, `long`) will truncate the decimal.
- Division between a decimal value (`float`, `double`) and a `number` value will produce a decimal.

``` java
2 / 3 = 0
16 / 5 = 3
8 / 4 = 2
-10 / 7 = -1
2.0 / 3 = 0.6666
16 / 5. = 3.2
(double) 1 / 6 = 0.1666
9d / 4 = 2.25
```
