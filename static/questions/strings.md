# Questions on Strings

## Question #1

``` java
String t = "MississippiBurning";
t.replaceAll("i","U");
out.println(t);
```

What is output by the code above?

1. `MississippiBurning`
2. `MUssUssUppUBurnUng`
3. `MussussuppuBurnung`
4. `MississippiBirning`
5. There is no output due to an error

+++ Answer

- `MUssUssUppUBurnUng`

+++

## Question #2

``` java
String s = "pneumonoultramicroscop"+
           "icsilicovolcanoconiosis";
while (s.length() > 10) {
    s = s.substring(3);
}
out.println(s);
```

What is output by the code segment above?

1. `oconiosis`
2. `noconiosis`
3. `pneumonou`
4. `pneumonoul`
5. There is no output due to an error.

+++ Answer

1. `noconiosis`

+++
