Class and Section: CS 245 - 01

Name: Victoria Salinas

Notes For TA/Grader:

	One big change that I made was the return type of isStringLengthEqual. Instead of returning a list with a -1 if the strings were not equal, I decided to just return an integer since it made it easier to check to see if the return value of isStringLengthEqual was either -1 or not. I then used an if statement in the main to see if the integer returned from isStringLengthEqual was anything except -1 so then I could call the minDeletionSize function. I did originally return a list in isStringLengthEqual and made that work, but then the minDeletionSize function would be called and return a list with a zero so changing the return type fixed that issue. 

	Despite all that, everything seems to be working properly now. I was kind of confused by the lab assignment sheet and what it wanted me to do, but I tried to follow the output as best as I could.

Runtime: 

	The runtime of minDeletionSize should be O(n^2) because there are two for loops. The first one depends on the length of the first string the user entered so that would loop n times, and then the inner loop also depends on the user's input so it would loop n times also. The if statement should iterate 1 time being constant. 

	so n*n*1 = O(n^2) for the runtime.

Space Complexity:

	The space complexity should be O(n) since the user is able to enter n amount of items into an array, and each individual value has to have it's own little space of memory.

