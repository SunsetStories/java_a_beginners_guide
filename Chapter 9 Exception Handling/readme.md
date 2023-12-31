# Chapter 9 Self Test

1. What class is at the top of the exception hierarchy?
   - `Throwable`
  
2. Briefly explain how to use `try` and `catch`.
   - Enclose the block of code that might throw an exception in the `try` block.
   - Populate in the `catch` block the type of exception to be thrown from the `try` block and enclose it with how it should be handled.
  
3. What is wrong with this fragment?
   ```
   // ...
   vals[18] = 10;
   catch ( ArrayIndexOutOfBoundsException exc) {
     // handle error
   }
   ```
   - The statement `vals[18] = 10;` is not enclosed in a `try` block, so the `catch` will not work.
  
4. What happens if an exception is not caught?
   - JVM might catch it or the program might terminate abruptly / perform unexpectedly.
  
5. What is wrong with this fragement?
   ```
   class A extends Exception {...

   class B extends A { ...

   // ...

   try {
     // ...
   }
   catch (A exc) {...}
   catch (B exc) {...}
   ```
   - Exception for `B` is caught in the first block as well. A superclass catch precedes a subclass catch. Since the superclass catch will catch all subclasses too, unreachable code is created.
  
6. Can an inner catch rethrow an exception to an outer catch?
   - Yes.
  
7. The `finally` block is the last bit of code executed before your program ends. True or False? Explain your answer.
   - False. The finally is the code executed when a try block ends.
     
8. What type of exceptions must be explicitly decalred in a `throws` clause of a method?
   - Exceptions, except those of type RuntimeException and Error thrown by the method that are not caught within it.
  
9. What is wrong with this fragment?
   ```
   class MyClass { //... }
   //...
   throw new MyClass();
   ```
   - `MyClass` did not extend `Exception` hence it can't be thrown.

10. In question 3 of the Chapter 6 Self Test, you created a `Stack` class. Add custom exceptions to your class that reportstack full and stack empty conditions.
    - Visit solutions folder.
      
11. What are the three ways that an exception can be generated?
    - Generated by JVM, code errors and manual exceptions thrown.
   
12. What are the two direct subclasses of `Throwable`?
    - `Exceptions` and `Error`.
   
13. What is the multi-catch feature?
    - Allowing multiple exceptions to be handled in a single catch using the OR operator.
   
14. Should your code typically catch expressions of type `Error`?
    - No. 
   
