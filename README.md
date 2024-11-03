Solutions for [cs61b, 2021](https://sp21.datastructur.es/).               

                       
- L1
  
- L2

# L3:Testing 
  - Test-driven development (TDD):
    - test for pieces, safely refactor
    - identify new feature -> write test that meant to fail at first and revise
    - **Integration testing**: ensure modules interact properly as a whole
  - references -> ==, !=
  - Java visualizer, sequence diagram(java)
  - [Junit](https://junit.org/junit5/docs/current/user-guide/#writing-tests)
    - #1 *org.junit.Assert.assertArrayEquals(expected, actual)*
 
      or *import org.junit.Assert.assert* and use directly & [**@Test**](https://junit.org/junit5/docs/current/user-guide/#writing-tests-assertions)
    - #2 Annotate each tests with *@org.junit.Test* & change all methods to **non-static**
    - save efforts to write tedious tests by oneself
  - deprecated error: working but not recommended
  - example -> **selection sorting**:
    
    find smallest -> move to front(*swap*)-> find smallest in the remaining (*recursion*)
    
# L4: References, Recursion, and Lists
  - 

