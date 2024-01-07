# Streams Intermediate Operation - Map

Stream map() is an intermediate operation and it returns new stream.

map method takes Function as argument that is a functional interface.

map(function mapper) it returns a new Stream as return value.
These operations are always lazy.

Stream operations don't mutate their source. Instead, they return new streams that holds
the result.