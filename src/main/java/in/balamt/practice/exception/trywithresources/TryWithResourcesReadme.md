## Try With Resources

_Introduced in Java version _ ** 7**


1. Try block can hold the resource we are trying to access. (Such as Reading file, Opening JDBC connection)
2. finally block is not required, because JVM takes care of resource close automatically
3. It uses java.lang.AutoCloseable interface
4. Catch and finally are optional since Java 7. because close method throw Exception and before that we had Closeable which had close method which throw IOException.
