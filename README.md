[![Java CI](https://github.com/xtermi2/java23/actions/workflows/maven.yml/badge.svg)](https://github.com/xtermi2/java23/actions/workflows/maven.yml)

# Schedule

- 2024/08/22 Final Release Candidate
- 2024/09/17 General Availability

# Java 23 Features

- [JEP 455: Primitive Types in Patterns, instanceof, and switch (Preview)](https://openjdk.org/jeps/455)
    - Enhance pattern matching by allowing primitive type patterns in all pattern contexts, and extend instanceof and switch to work with all primitive types.
    - see example `PrimitiveTypesInPatterns.java`
- [JEP 466: Class-File API (Second Preview)](https://openjdk.org/jeps/466)
    - Provide a standard API for parsing, generating, and transforming Java class files.
    - Second Preview contains refinements based upon experience and feedback.
    - see example `ClassFileAPI.java`
- [JEP 467: Markdown Documentation Comments](https://openjdk.org/jeps/467)
    - Enable JavaDoc documentation comments to be written in Markdown rather than solely in a mixture of HTML and JavaDoc @-tags.
    - see example `MarkdownDoc.java`
- [JEP 469: Vector API (Eighth Incubator)](https://openjdk.org/jeps/469)
    - Introduce an API to express vector computations that reliably compile at runtime to optimal vector instructions on
      supported CPU architectures, thus achieving performance superior to equivalent scalar computations.
    - Notable changes since 7th incubator:
        - Re-incubate the API in JDK 23 with no API changes and no substantial implementation changes.
- [JEP 473: Stream Gatherers (Preview)](https://openjdk.org/jeps/473)
    - Enhance the Stream API to support custom intermediate operations. This will allow stream pipelines to transform data in ways that are not easily achievable with the existing built-in intermediate operations.
    - Notable changes since first preview:
      - Re-preview the API in JDK 23, without change, in order to gain additional experience and feedback
    - See example `StreamGatherers.java`
- [JEP 471: Deprecate the Memory-Access Methods in sun.misc.Unsafe for Removal](https://openjdk.org/jeps/471)
    - Deprecate the memory-access methods in sun.misc.Unsafe for removal in a future release. These unsupported methods have been superseded by standard APIs, namely the VarHandle API (JEP 193, JDK 9) and the Foreign Function & Memory API (JEP 454, JDK 22). We strongly encourage library developers to migrate from sun.misc.Unsafe to supported replacements, so that applications can migrate smoothly to modern JDK releases.
- [JEP 474: ZGC: Generational Mode by Default](https://openjdk.org/jeps/474)
    - Switch the default mode of the Z Garbage Collector (ZGC) to the generational mode. Deprecate the non-generational mode, with the intent to remove it in a future release.
    - when using `-XX:+ZGenerational`: A warning that the ZGenerational option is deprecated is issued. This mode is now the default in JDK23
    - when using `-XX:-ZGenerational`: A warning that the non-generational mode is deprecated for removal is issued.
- [JEP 476: Module Import Declarations (Preview)](https://openjdk.org/jeps/476)
    - Enhance the Java programming language with the ability to succinctly import all of the packages exported by a module. This simplifies the reuse of modular libraries, but does not require the importing code to be in a module itself.
    - See example `ModuleImportDeclaration.java`
- [JEP 477: Implicitly Declared Classes and Instance Main Methods (Third Preview)](https://openjdk.org/jeps/477)
    - Evolve the Java language so that students can write their first programs without needing to understand language
      features designed for large programs. Far from using a separate dialect of Java, students can write streamlined
      declarations for single-class programs and then seamlessly expand their programs to use more advanced features as
      their skills grow.
    - changes since second preview in JDK 22:
        - Implicitly declared classes automatically import three static methods for simple textual I/O with the console. These methods are declared in the new top-level class java.io.IO. 
        - Implicitly declared classes automatically import, on demand, all of the public top-level classes and interfaces of the packages exported by the java.base module.
    - see example `UnnamedClasses.java`
- [JEP 480: Structured Concurrency (Third Preview)](https://openjdk.org/jeps/480)
    - Simplify concurrent programming by introducing an API for structured concurrency. Structured concurrency treats
      groups of related tasks running in different threads as a single unit of work, thereby streamlining error handling
      and cancellation, improving reliability, and enhancing observability.
    - no changes since last preview in JDK 22.
    - see example `StructuredConcurrency.java`
- [JEP 481: Scoped Values (Third Preview)](https://openjdk.org/jeps/481)
    - Enable the sharing of immutable data within and across threads. They are preferred to thread-local variables,
      especially when using large numbers of virtual threads.
    - Unlike a thread-local variable, a scoped value is written once and is then immutable, and is available only for a
      bounded period during execution of the thread.
    - In effect, a scoped value is an implicit method parameter. It is "as if" every method in a sequence of calls has
      an additional, invisible, parameter. None of the methods declare this parameter and only the methods that have
      access to the scoped value object can access its value (the data). Scoped values make it possible to pass data
      securely from a caller to a faraway callee through a sequence of intermediate methods that do not declare a
      parameter for the data and have no access to the data.
    - changes since second preview in JDK 22:
      - The type of the operation parameter of the ScopedValue.callWhere method is now a new functional interface which allows the Java compiler to infer whether a checked exception might be thrown. With this change, the ScopedValue.getWhere method is no longer needed and is removed.
    - see example `ScopedValueServer.java`
- [JEP 482: Flexible Constructor Bodies (Second Preview)](https://openjdk.org/jeps/482)
    - In constructors in the Java programming language, allow statements that do not reference the instance being
      created to appear before an explicit constructor invocation.
    - changes since first preview in JDK 22:
      - Allow a constructor body to initialize fields in the same class before explicitly invoking a constructor.
    - see example `FlexibleConstructorBodies.java`

----------------------

##### Other References

- https://openjdk.org/projects/jdk/23/
