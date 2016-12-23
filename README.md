#### Test project for reprodicing [SUREFIRE-1239](https://issues.apache.org/jira/browse/SUREFIRE-1239) bug

Command to reproduce:
```
mvn test
```
as result you will see:

```
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-failsafe-plugin:2.19.1:integration-test (default) on project big-output-bug: Execution default of goal org.apache.maven.plugins:maven-failsafe-plugin:2.19.1:integration-test failed: java.lang.RuntimeException: org.apache.maven.surefire.report.ReporterException: When writing xml report stdout/stderr: /tmp/stdout5472567136559935069deferred (No such file or directory) -> [Help 1]
```

or build can just hang
