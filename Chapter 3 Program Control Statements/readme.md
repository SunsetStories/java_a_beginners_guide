# Chapter 3 Self Test

1. Write a program that reads characters from the keyboard until a period is received. Have the program count the number of spaces. Report the total at the end of program.
   - Visit solution folder.
  
2. Show the general form of the `if-else-if` ladder.
   ```
    if (condition) {
        //.. statement;
     } else if (condition 2) {
        //.. statement;
     } else {
       //.. statememnt;
     }     
   ```

3. Given
   ```
   if (x < 10)
     if (y > 100) {
       if (!done) x = z;
       else y = z;
     }
   else System.out.println("error"); //what if?
   ```
   to what `if` does the last `else` associate?
   - `if(!done)`.
  
4. Show the `for` statement in a loop that counts from 1000 to 0 by -2.
   - `for(int i = 1000; i >= 0; i-=2)`
  
5. Is the following fragment valid?
   ```
   for (int i = 0; i < num; i++)
     sum += i;
   count = i;
   ```
   - Invalid. `i` exists only within the scope of the `for` loop.
  
6. Explain what `break` does. Be sure to explain both of its forms.
   - `break` terminates the loop / switch within the scope it resides it
   - `break scope_name` terminates the loop belonging to the `scope_name`.
  
7. In the following fragment, after the `break` statement executes, what is displayed?
   ```
   for (i=0; i<10; i++) {
     while (running) {
       if (x<y) break;
       // ...
     }
     System.out.println("after while");
   }
   System.out.println("After for");
   ```
   - `after while`.
  
8. What does the following fragment print?
   ```
   for (int i=0; i<10; i++) {
     System.out.print(i + " ");
     if ((i%2) == 0) continue;
     System.out.println();
   }
   ```
   - `0 1 \n 2 3 \n 4 5 \n 6 7 \n 8 9`.
  
9. The iteration expression in a `for` loop need not always alter the loop control variable by a fixed amount. Instead, the loop control variable can change in any arbitrary way. Using this concept, write a program that uses a `for` loop to generate and display the progression `1,2,4,8,16,32,` and so on.
   - Visit solution folder.
  
10. The ASCII lowercase letters are separated from the uppercase letters by 32. Thus, to convert a lowercase letter to uppercase, subtract 32 from it. Use this information to write a program that reads characters from the keyboard. Have it convert all lowercase letters to uppercase, and all uppercase to lowercase, displaying the result. Make no changes to any other character. Have the program stop when the user enters a period. At the end, have the program display the number of case changes that have taken place.
    - Visit solution folder.
   
11. What is an infinite loop.
    - A loop that does not have a terminating condition / terminating condition is never met.
   
12. When using `break` with a label, must the label be on a block that contains the `break`?
    - Not necessarily within the immediate block but `break` should be nested in it. 
