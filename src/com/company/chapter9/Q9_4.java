package com.company.chapter9;

public class Q9_4 {

    /*
    Duplicate URLs: You have 10 billion URLs. How do you detect the duplicate documents? In this
    case, assume "duplicate" means that the URLs are identical.

    Answer:
    Use a smaller version of the problem and solve it. Scale the small problem with additional resources.

    How do we detect identical URLs? Store all URLs into a hash table. If duplicate url founds, return the URL else insert the URL into the hash table.

    How to we scale this solution into large number of input?
    We split the 10 billion URLs into multiple collection of lists. Load the list and do the comparision. We could use database table as hash table in order to avoid out of memory.



     */
}
