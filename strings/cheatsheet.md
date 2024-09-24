# Strings Cheatsheet

## String Basics

Strings are **immutable** (cannot change)
Strings are **objects** (not primatives)

```java
// Creation
String s = "Hello, World!";
s = "Change the value";
// Concatination
s = s + "Addition";
```

## String Indexes

Indexes start at `0`

| String | H   | e   | l   | l   | o   |
| ------ | --- | --- | --- | --- | --- |
| Index  | 0   | 1   | 2   | 3   | 4   |

## Important Functions

| Function Name | Parameter list | Parameter #1 | Parameter #2 | Return                                |
| ------------- | -------------- | ------------ | ------------ | ------------------------------------- |
| `int s.length()`  |                |              |              | the length of the string |
| `String s.substring()` | `int start, int end` | Start index of your substring | End index of your substring | A substring of `s` from indecies `start` to `end - 1` |
| `String s.substring()` | `int start` | Start index of your substring | | A substring for index `start` to the end of the string |
| `int s.indexOf()` | `String str` | String to search for within the string | | if `str` is found inside `s`, then it gives the index where it is found, if not returns `-1` |
| `int s.lastIndexOf()` | `String str` | String to search for within the string | | if `str` is found within `s`, it gives the index of the last occurence of that `str`, otherwise returns `-1` |
| `char s.charAt()` | `int i` | Index in the string | | Returns the character at index `i` |

## Function Examples

``` java
String s = "Hello";

out.println(s.length());          // Prints out 5
out.println(s.substring(2, 4));   // Prints out ll
out.println(s.substring(1));      // Prints out ello
out.println(s.indexOf("ll"));     // Prints out 2
out.println(s.indexOf("ellooo")); // Prints out -1
out.println(s.lastIndexOf("l"));  // Prints out 3
out.println(s.charAt(3))          // Prints out 3
```
