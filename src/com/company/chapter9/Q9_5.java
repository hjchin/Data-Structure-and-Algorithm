package com.company.chapter9;

public class Q9_5 {

    /*

    Cache: Imagine a web server for a simplified search engine. This system has 100 machines to
    respond to search queries, which may then call out using processSearch(string query)
    to another cluster of machines to actually get the result. The machine which responds to a given
    query is chosen at random, so you cannot guarantee that the same machine will always respond to
    the same request. The method processSearch is very expensive. Design a caching mechanism
    to cache the results of the most recent queries. Be sure to explain how you would update the cache
    when data changes.

    Answer:
    most recent result -> last 10 query search.
    search result -> stored in a list, text file.

    a hash table of query keyword and hash value of the text file content.
    for each new search, we store and keyword and the create the text file hash value. The text file is then stored in a directory.
    Subsequent search for the same query keyword, we retrieve the text file and return it.
    New search query keyword will replace the oldest keyword in the queue.

    When data changes, we check if cache exists for the same keyword. if cache exists, we simply clear the text file.
    Next lookup for the missing cache will force to regenerate the cache from actual search.


     */
}
