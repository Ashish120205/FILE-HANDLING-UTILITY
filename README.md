# FILE-HANDLING-UTILITY

*COMPANY*: CODETECH IT SOLUTIONS

*NAME*: ASHISH KUMAR

*INTERN ID*: CT04DH1575

*DOMAIN*: JAVA PROGRAMMING 

*DURATION*: 4 WEEKS

*MENTOR*: NEELA SANTHOSH KUMAR

**DESCRIPTION OF TASK** :
   This Java program titled FileHandler is designed to demonstrate how to perform basic file operations such as writing, reading, and modifying text files using Java’s built-in libraries. These are fundamental skills in programming and are often used in areas like logging systems, configuration management, and simple text processing tasks. The FileHandler program performs the following operations in sequence: it first writes a sample message to a file, reads and displays the content, prompts the user to replace a word in the file with another word, and finally reads and displays the updated content. This interaction is done via the console, making the program simple and user-friendly.

The development of this program was done using Visual Studio Code (VS Code) — a popular, lightweight, and free source code editor. It offers strong support for Java through extensions such as the Java Extension Pack, which includes tools for compiling, running, and debugging Java applications. VS Code’s integrated terminal and intelligent code suggestions made it easier to test and troubleshoot the code in real-time, without switching between windows or terminals.

The program uses several important Java classes:

FileWriter: To write data to a text file.

FileReader and BufferedReader: To read data line-by-line from the file.

Scanner: To accept input from the user via the console.

StringBuilder: To build modified content efficiently while reading and updating the file.

In the beginning, the program writes a hardcoded string into a file named sample.txt. Then, it reads the contents and prints them to the console so the user can see the current state of the file. Next, the user is asked to enter a word they want to replace, along with the new word they want to use. The program reads the file again, replaces the old word with the new one using the replaceAll() method, and writes the updated content back to the same file. Finally, it reads and displays the modified file content to confirm the update was successful.

The program is also wrapped in try-catch-finally blocks to gracefully handle exceptions like IOException. This makes it robust and helps prevent crashes due to missing files or access errors. Proper resource management is maintained by closing the Scanner, BufferedReader, and FileWriter objects after their operations are completed, helping avoid memory leaks.

This task is an excellent example of how to handle files using Java. It teaches students or beginners how to interact with files dynamically and safely, while also introducing them to common coding patterns such as reading user input, modifying content, and exception handling. This practical task is not just limited to academics; it reflects real-world scenarios where logs, configuration files, or stored data need to be accessed and modified.

In summary, the FileHandler Java application offers a clear and practical understanding of file operations, user input handling, and text replacement logic. By using VS Code as the development environment, the project workflow becomes smooth and efficient, supported by a modern interface and useful developer tools. This combination of Java and VS Code provides an effective setup for building, testing, and learning file handling in a beginner-friendly way.
