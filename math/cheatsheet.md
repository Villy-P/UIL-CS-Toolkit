# Math Cheatsheet

- [Math Cheatsheet](#math-cheatsheet)
  - [Constants](#constants)
  - [Functions](#functions)
  - [Function Examples](#function-examples)
  - [Random in range](#random-in-range)

The `Math` class does **not** need to be imported

## Constants

All constants are `doubles`

| Constant  | Value |
| --------- | ----- |
| `Math.PI` | `π`   |
| `Math.E`  | `E`   |

## Functions

> Functions with a type of `number` accept types `double`, `float`, `int`, `long`
> 
> The return type will match the parameter type

| Function Name      | Parameters                | Return                                              |
| ------------------ | ------------------------- | --------------------------------------------------- |
| `Math.abs() *`     | `number a`                | `number`: Absolute Value                            |
| `Math.pow()`       | `double a`, `double b`    | `double`: `a` to the power of `b`                   |
| `Math.sqrt()`      | `double a`                | `double`: The square root of `a`                    |
| `Math.cbrt()`      | `double a`                | `double`: The cube root of `a`                      |
| `Math.min()`       | `number a`, `number b`    | `number`: Smallest number between `a` and `b`       |
| `Math.max()`       | `number a`, `number b`    | `number`: Largest number between `a` and `b`        |
| `Math.sin()`       | `double a` **in radians** | `double`: trigonometric sine of an angle            |
| `Math.cos()`       | `double a` **in radians** | `double`: trigonometric cosine of an angle          |
| `Math.tan()`       | `double a` **in radians** | `double`: trigonometric tangent of an angle         |
| `Math.toRadians()` | `double a` **in degrees** | `double`: Converts degrees to radians               |
| `Math.hypot()`     | `double a`, `double b`    | `double`: Hypotenuse of a triangle (`sqrt(x2 +y2)`) |
| `Math.floor()`     | `double a`                | `double`: Truncates `a`                             |
| `Math.ceil()`      | `double a`                | `double`: Rounds `a` up to the nearest whole number |
| `Math.round()`     | `double a`                | `long`: `a` rounded to the nearest whole number     |
| `Math.round()`     | `float a`                 | `int`: `a` rounded to the nearest whole number      |
| `Math.random()`    |                           | `double`: Random number in the range `0 <= x < 1`   |

## Function Examples

``` java
Math.abs(-3) = 3;
Math.pow(7, 2) = 49.0;
Math.sqrt(64) = 8.0;
Math.cbrt(64) = 4.0;
Math.min(2, 4) = 2;
Math.max(2, 4) = 4;
Math.sin(0) = 0.0;
Math.cos(Math.PI) = -1.0;
Math.tan(0) = 0.0;
Math.toRadians(90) = 1.5707;
Math.hypot(3, -4) = 5.0;
Math.floor(4.8) = 4.0;
Math.ceil(4.8) = 5.0;
Math.round(4.5) = 5;
```

## Random in range

``` java
// Returns a number between min (inclusive) and max (inclusive)
public static randInRange(int min, int max) {
    return (int)(Math.random() * ((max - min) + 1)) + min;
}
```
