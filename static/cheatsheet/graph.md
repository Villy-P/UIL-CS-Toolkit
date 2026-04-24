# Graph Theory

- [Graph Theory](#graph-theory)
  - [Spanning Tree](#spanning-tree)
  - [Adjancency Matrix](#adjancency-matrix)
  - [Algorithms](#algorithms)
    - [Kruskal's Algorithm](#kruskals-algorithm)
    - [Floyd-Warshall Algorithm](#floyd-warshall-algorithm)
    - [Ford-Fulkerson Algorithm](#ford-fulkerson-algorithm)
    - [Prim's Algorithm](#prims-algorithm)
    - [Big O](#big-o)

## Spanning Tree

Spanning Trees are subgraphs represented as a tree which contains all the vertices of a graph.

A mimimum spanning tree is a spanning tree that contains all vertices of a weigthed graph that has the lowest value.

You can find the Minimum Spanning Tree using Kruskal's algorithm or Prim's algorithm.

## Adjancency Matrix

An adjancency matrix is a matrix of size `V^2` where a `1` represents an edge between the two nodes and a `0` represents no connection.

A vertex cannot have a connection with itself, meaning the diagonal in the matrix starting from the top left to the bottom right will all be `0`.

## Algorithms

### Kruskal's Algorithm

Kruskal's algorithm is a greedy algorithm used to find the Minimum Spanning Tree of a connected, weighted, and undirected graph.

### Floyd-Warshall Algorithm

Floyd-Warshall algorithm is a technique used to find the shortest path between all pairs of vertices in a weighted graph.

### Ford-Fulkerson Algorithm

Ford-Fulkerson algorithmis an algorithm that computes the maximum flow of a flow network.

### Prim's Algorithm

Prim's algorithm is a greedy algorithm used to find the Minimum Spanning Tree of a connected, weighted, and undirected graph.

### Big O

> `E = O(V^2)`, so anywhere there is `O(E log(E))` it also equals `O(E log(V))`.

| Algorthim                | Time Complexity | Space Complexity |
| ------------------------ | --------------- | ---------------- |
| Kruskal Algorithm        | O(E log(E))     | O(V + E)         |
| Floyd-Warshall Algorithm | O(V^3)          | O(V^2)           |
