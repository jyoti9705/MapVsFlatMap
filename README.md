# MapVsFlatMap

1. Scenario
    1. We have list of employees, and we need to get list of cities they have worked in past years
2. How Stream.Map Works?
    1. Map performs map functional operation to take list stream in one format and convert it to another
    2. E.g. if for above scenario instead of Employee list we want List of Employee Ids we can make use of Map function
       in Java 8
    3. When we convert one stream to another using map original list remains unmodified
    4. A new stream is generated as response and returned rather than modifying the source list
    5. e.g : Cities list for each employee with Map  : [[Mumbai, Kerala, Pune, Bangalore]
       , [Mumbai, Chennai, Pune, Kolkata], [Mumbai, Pune, Hyderabad]]
    6. In above example we can see it is not a single stream it is streamed of cities stream
3. How FlatMap Works?
    1. Flat Map is combination of Map and then Flattening it to return the output
    2. This means you first apply the map and then make it flat to return just one set with single values
    3. e.g : Cities list using Flat Map for each
       employee :  [Mumbai, Kerala, Pune, Bangalore, Mumbai, Chennai, Pune, Kolkata, Mumbai, Pune, Hyderabad]
    4. In above example we can single stream is returned