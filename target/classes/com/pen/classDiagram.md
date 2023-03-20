<!-- ------------------------------------------
How to approach a low level design question
 
1. Single line problem statement
2. Gather requirements
3. Clarify requirements
4. Class Diagram
5. Schema Design 
6. Code
--------------------------------------------->



<!-- ------------------------------------------
Gather Requirements
 
1. Single line problem statement
2. Gather requirements
3. Clarify requirements
4. Class Diagram
5. Schema Design 
6. Code
--------------------------------------------->



<!-- ------------------------------------------
How to take input from user

1. Via CLI ( No framework needed)
2. RESt APIs (framework required)
--------------------------------------------->



<!-- ------------------------------------------
After getting problem statement, Clear Interviewer expectation

1. Clarify the problem statement, so that you and interview are on the same page
2. Do you want me to implement full working code or do you want me to design only entity?
3. Do we have to persist the data?
4. How will system take input? 
----------------------------------------------->



# Design a Pen

    *First understand the problem statement very clearly.


---
### Gather Requirements
```
- Anything that can write is a pen
- Different types of pen - Ball, gel, Fountain, Marker etc
- A pen can have a refil. Refil has ink.
- Fountain pen directly has ink.
- Inks can be of different color.
- Every pen will have a brand, name, and price.
- For some pen we may be able to change refil but for other we might not
- Refil has a nib. But for fountain pen, pen has a nib.
- Nib can be of different radius
- Multiple pens might have same write behaviour
- Some pen can be refillable other can't.
```

---
### Clarifying Requirements
```
How to clarify requirements?
1. How different features are going to work
2. Edge Cases of the behaviours
3. Future modification 

- Multiple pens might have same write behaviour
- Some pen can be refillable other can't.
```

---
### Class Diagram
```
How to come up with a class diagram?
1. Visualization - Games, Entity (Non Machine coding)
2. Finding nouns via requirements - (Machine Coding)
```
To be continued after I learn factory Design pattern