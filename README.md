# Java-Code-To-Create-Encoding-Message

Problem Description :

Encoding the string,taking each character, and "encrypting" it by changing
it to the next letter. Basically, a is b, b is c, c is d, and etc. It isn't secure but it isn't meant to be for these purposes. 
The scanned string can be anything as an example, "Orange juice is great! I drank 83,214 cups of it yesterday.
The string is encoded as per the below scenarios
The  encryption technique is to replace each letter with the place it as is in the alphabet. 
We will use two digits for every letter. For example, the letter ‘a’ is 01, the letter ‘b’ is 02, the letter ‘c’ is 03, the letter ‘z’ is 26. 
So that we can use capital letters we start ‘A’ with 27, ‘B’ with 28, ‘C’ with 29, and so on.
For numbers, we convert each digit into two letters: the first two letters that they stand for. 
The first letter is capitalized followed by a lower-case letter. For example, 8 written out is eight.
 So, 8 would be encrypted to “Ei”, 1 would be encrypted to “On”, 2 would be encrypted to “Tw”, 3 would be “Th” and so on.
Note that “10” is actually two digits, so it would be encrypted as “1” and “0”: “OnZe”
If you come to a non-letter character (spaces, punctuation, numbers, etc.), just print them as is without encrypting.
