package com.company.chapter9;

public class Q9_1 {

    /*
    Stock Data: Imagine you are building some sort of service that will be called by up to 1,000 client
    applications to get simple end-of day stock price information (open, close, high, low). You may
    assume that you already have the data, and you can store it in any format you wish. How would you
    design the client-facing service that provides the information to client applications? You are responsible for the
    development, rollout, and ongoing monitoring and maintenance of the feed. Describe the different methods you
    considered and why you would recommend your approach. Your service can use any technologies you wish,
    and can distribute the information to the client applications in any mechanism you choose.


    Interface
    ----------

    request:
    /stock/xxx


    response:
    {
      name: "Stock Name",
      open: 12.25,
      close: 14.15,
      high: 16.00,
      low: 14.15
    }

    use webservice, it is easy to consume and easy to maintain.

    RESTFUL API is an easy to understand format and it suits well with CRUD. For example, we use stock/xxx/sell for action sell, stock/xxx/buy for action buy. It works better than query URL.
    XML and Json are the common response format. I pick Json for its simplicity and less overhead in processing the data. It is easy to read by human too.

    Storage
    ----------
    Database is common storage mechanism and it provides default SQL query mechanism with account id as the name. The drawback is higher development cost.
    Text file works too. We could use text file to store the data as the json file. Using the file API, it is simple to retrieve a file and send as response.

     */
}
