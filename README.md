# Java challenge base template

This repository supplies the Java starter project materialized at the root of
each generated challenge. A student project contains only the public starter
files:

```text
README.md
pom.xml
src/main/java/ar/edu/utn/Main.java
```

Run it from the project root with `mvn test` (or `mvn package`). The project
targets Java 21 and uses JUnit 5 for tests.

## Test boundary for the generator

Do not include hidden tests or their helpers in this student-visible base.
When the backend generates a challenge, it must add private tests under
`src/test/java/ar/edu/utn/hidden`; optional public tests may be added under
`src/test/java/ar/edu/utn/public`. The test helper belongs with the private
test infrastructure and must be relocated there by the backend along with the
hidden tests. In particular, it must not be copied from the generated project
into `src/main` or bundled among student files.
