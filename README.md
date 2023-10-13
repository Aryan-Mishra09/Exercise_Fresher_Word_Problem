# Exercise_Fresher_Word_Problem 
Introduction
Compound words are words formed by combining two or more smaller words. For example, "teaspoon" can be formed by combining "tea" and "spoon." The Compound Word Finder program is used to find such compound words within a list of input words.

How It Works
The program reads a list of words from a specified input file and stores them in a data structure.
It then identifies prefixes for each word and adds them to a queue along with the remaining part of the word.
Using a breadth-first search algorithm, the program explores the possible compound words by removing prefixes and checking if the remaining part is also a valid word from the input list.
The program keeps track of the longest and second-longest compound words it discovers.
Getting Started
Prerequisites
Java Development Kit (JDK) installed on your system.
Installation
Clone the repository to your local machine:

bash
Copy code
git clone https://github.com/your-username/compound-word-finder.git
Navigate to the project directory:

bash
Copy code
cd compound-word-finder
Compile the Java program:

bash
Copy code
javac CompoundWordFinder.java
Usage
To use the Compound Word Finder program, follow these steps:

Create an input file (e.g., "Input.txt") with a list of words, one word per line.

Run the program, specifying the path to your input file as an argument:

bash
Copy code
java CompoundWordFinder "Input.txt"
The program will display the longest compound word and the second-longest compound word found in your input file, along with the time taken for the operation.

Sample Input File
You can use the provided Input_01.txt file as a sample input to test the program. Feel free to replace it with your own list of words in the specified format.



