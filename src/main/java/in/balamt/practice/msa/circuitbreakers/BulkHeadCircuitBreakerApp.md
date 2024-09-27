To configure the bulkhead circuit breaker properties in a Spring Boot application using Resilience4j, you typically need to specify the following properties in your `application.properties` or `application.yml` file:

```properties
# Bulkhead Configuration
resilience4j.bulkhead.configs.myBulkhead.max-concurrent-calls=10
resilience4j.bulkhead.configs.myBulkhead.max-wait-duration=1000
resilience4j.bulkhead.configs.myBulkhead.writable-stack-trace-enabled=true
```

Here's what these properties mean:

- `resilience4j.bulkhead.configs.myBulkhead.max-concurrent-calls`: The maximum number of concurrent calls allowed to the protected resource. This is the main property for configuring the bulkhead. Defaults to 25.

- `resilience4j.bulkhead.configs.myBulkhead.max-wait-duration`: The maximum time (in milliseconds) that a caller will wait for a call to the protected resource when the bulkhead is full. Defaults to 0, indicating no wait time.

- `resilience4j.bulkhead.configs.myBulkhead.writable-stack-trace-enabled`: Determines whether the stack trace should be captured for exceptions thrown when the bulkhead is full. Defaults to true.

These properties can be adjusted according to your application's requirements and performance characteristics. Remember to replace `myBulkhead` with the name of your bulkhead instance if you have configured it with a different name.