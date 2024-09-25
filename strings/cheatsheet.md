# Strings Cheatsheet

- [Strings Cheatsheet](#strings-cheatsheet)
  - [String Basics](#string-basics)
  - [String Indexes](#string-indexes)
  - [Important Functions](#important-functions)
  - [Function Examples](#function-examples)
  - [Converstions](#converstions)

## String Basics

Strings are **immutable** (cannot change)
Strings are **objects** (not primatives)

```java
// Creation
String s = "Hello, World!";
s = "Change the value";
String s = new String("Hello, World");
// Concatination
s = s + "Addition";
```

## String Indexes

Indexes start at `0`

| String | H   | e   | l   | l   | o   |
| ------ | --- | --- | --- | --- | --- |
| Index  | 0   | 1   | 2   | 3   | 4   |

## Important Functions

| Function Name          | Parameter List                                                                        | Return                                                                                                                                                  |
| ---------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `s.length()`           |                                                                                       | `int`: the length of the string                                                                                                                         |
| `s.substring()`        | `int start`: Start index of your substring <br> `int end` End index of your substring | `String`: A substring of `s` from indecies `start` to `end - 1`                                                                                         |
| `s.substring()`        | `int start`: Start index of your substring                                            | `String`: A substring for index `start` to the end of the string                                                                                        |
| `s.indexOf()`          | `String str`: String to search for within the string                                  | `int`: if `str` is found inside `s`, then it gives the index where it is found, if not returns `-1`                                                     |
| `s.lastIndexOf()`      | `String str`: String to search for within the string                                  | `int`: if `str` is found within `s`, it gives the index of the last occurence of that `str`, otherwise returns `-1`                                     |
| `s.charAt()`           | `int i`: Index in the string                                                          | `char`: Returns the character at index `i`                                                                                                              |
| `s.compareTo()`        | `String str`: String to compare to                                                    | `int`: returns the ascii difference between the first different characters going left to right                                                          |
| `s.equals()`           | `String other`: String to compare to                                                  | `boolean`: `true` if they are equal to one another, `false` otherwise. **Do NOT use ==**                                                                |
| `s.equalsIgnoreCase()` | `String other`: String to compare to                                                  | `boolean`: `true` if they are equal to one another, ignoring whether or not the letters are uppercase / lowercase, `false` otherwise. **Do NOT use ==** |
| `s.split()`            | `String regex`: String to split by                                                    | `String[]`: Array with the string broken up by the regex                                                                                                |

## Function Examples

``` java
String s = "Hello";

out.println(s.length());           // Prints out 5
out.println(s.substring(2, 4));    // Prints out ll
out.println(s.substring(1));       // Prints out ello
out.println(s.indexOf("ll"));      // Prints out 2
out.println(s.indexOf("ellooo"));  // Prints out -1
out.println(s.lastIndexOf("l"));   // Prints out 3
out.println(s.charAt(3));          // Prints out 3
out.println(s.compareTo("Hello")); // Prints out 0
out.println(s.equals("Hello"));    // Prints out true
out.println(s.equals("hello"));    // Prints out true
out.println(s == "Hello");         // Prints out false
out.println(s.split("e"));         // ["H", "llo"]
out.println(s.split(""));          // ["H", "e", "l", "l", "o"]
```

## Converstions

``` java
String s;
// String to char
s.charAt(0);
// String to int
Integer.parseInt(s);
// String to Integer (class)
Integer.valueOf(s);
```
