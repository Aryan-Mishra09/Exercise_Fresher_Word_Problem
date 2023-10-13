# Exercise_Fresher_Word_Problem

# Introduction
Compounded words are the words formed using one or more of the valid words only in the selected file. 
 - Since the files are already sorted alphabetically and only contain one word per line some of the the valid words that compose the compounded words are bound to come before the compounded word itself.
 - Thus the compounded word can be thought of as the combination of some of the the words that have been already read i.e. -> prefix, and a suffix.
 - If there is a situation where some character which is not the part of any valid word in the file but occours within any position of the word currently being read. Then the word can not be considered as a 
   compounded word.
 -Compound Word Finder is a Java program designed to identify the longest and second-longest compound words from a list of words provided in a text file. This program is built using Java and employs a breadth-first 
  search approach to discover compound words.

# How it works

- The program reads a list of words from a specified input file and stores them in a data structure.
- It then identifies prefixes for each word and adds them to a queue along with the remaining part of the word.
- Using a breadth-first search algorithm, the program explores the possible compound words by removing prefixes and checking if the remaining part is also a valid word from the input list.
- The program keeps track of the longest and second-longest compound words it discovers.

 # Source Code Execution
 # Requirements
  - Java Development Kit installed on your system.
  - Clone the repository to your local machine:"https://github.com/Aryan-Mishra09/Exercise_Fresher_Word_Problem.git" 
  - Navigate to the project directory:"cd compound-word-finder"
  - Compile the Java program:"javac CompoundWordFinder.java"

 # Approach
 1. Create a Java Class:

Create a Java class named CompoundWordFinder. This class will contain methods for building a data structure to store words, finding prefixes of words, and finding the longest compound words.

2. Define Data Structures:

Create a HashSet to store valid words. This set will be used to check if a word exists in the list of valid words.
Create a Deque to maintain a queue of <word, remainder> pairs. This queue will be used to process words and their remaining suffixes.
3. Create a Constructor:

Define a constructor for the CompoundWordFinder class. In the constructor, initialize the wordSet and wordQueue data structures.

4. Define a Nested Class:

Create a nested class, WordPart, to represent a word and its remainder (suffix). This class will be used to store word-suffix pairs in the queue.

5. Read Words from File:

Create a method, such as addWordsFromFile, to read words from a file. Open and read the file line by line, trimming each line to remove leading and trailing spaces. Add these words to the wordSet and find prefixes for each word to create initial <word, remainder> pairs in the wordQueue.

6. Find Prefixes:

Implement a method, such as getPrefixes, to find prefixes for a given word. Iterate through the characters of the word and check if the current prefix exists in the wordSet. If a prefix is found, add it to a deque of prefixes.

7. Find Longest Compound Words:

Create a method, such as findLongestCompoundWords, to find the longest compound words. Initialize variables to keep track of the longest and second longest compound words. Process elements from the wordQueue by examining each word and its remainder.

If the remainder exists in the wordSet and the current word is longer than the longest found so far, update the longest and second longest words.
If not, find prefixes for the remainder and generate new <word, remainder> pairs to be added to the wordQueue.
 
 # Sample Input File
   Use the provided Input_01.txt and Input_02.txt file as a sample input to test the program.
   Output is shown in the form of png file named as OUTPUT1.png and OUTPUT2.png 
