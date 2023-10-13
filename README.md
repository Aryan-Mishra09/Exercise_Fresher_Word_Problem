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
  - Clone the repository to your local machine:"git clone 
  - Navigate to the project directory:"cd compound-word-finder"
  - Compile the Java program:"javac CompoundWordFinder.java"
