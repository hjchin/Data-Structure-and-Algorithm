package com.company.chapter9;

public class Q9_2 {

    /*

    Social Network: How would you design the data structures for a very large social network like Facebook or Linked In?
    Describe how you would design an algorithm to show the shortest path between
    two people (e.g., Me -> Bob -> Susan -> Jason -> You).

    Answer:
    Graph is the suitable data structure for social network. it can has many edges just like connection between people.

    use bi-directional breath first check for 2 known people. Search starts from known node and store the paths. if they cross path,
    a common node for both searches, the shortest path is identified.


     */
}
