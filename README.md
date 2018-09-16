# Epi-Use
Assessment

The following code is in accordance to the questions stated upon the EPI-USE assignment sheet.

Question 1: The program should search by employee name and display the details on the screen.
Question 2: The user must input a date and the program lists employees born before, after and on the specified date.
Question 3: Prints the organizational structure within the company
Question 4: The program displays the highest earning individuals per tier

Assumptions
Some information was limited, and therefore assumptions were introduced in order to code the project.
*The manager is considered as the highest member and reports to no one, therefore his reportTo status is N/A
*Some salaries, date of births and and employee numbers where made up

Textfile
The textfile is called "Workers.txt" and contains 5 workers. Each worker has a name, surname, date of birth, employee number, role and reportTo variable.

Framework
The program was built using Java (version 1.8.0) on Eclipse Neon(version 4.6.0). Data was read from a textfile labelled "Workers.txt".

Running the Program
1) Download the project file (A jar file has been created)
2) The jar file is located in the root folder titled "Run.jar"
3) Open the command prompt (cmd) and type cd + "plus the path of the jar file"
4) Once the directory has been changed to the new location, type "java -jar Run.jar". This command will execute the jar file.

Contents within the program
As mentioned the program provides solutions to the questions from the assignment sheet. 
*The user will be presented with a menu. Simply type in the number you wish to run and press enter, the appropriate code will execute and ask 
for user input for questions 1 and 2. Questions 3 and 4 simply display the results.
*After the appropriate files have executed a return menu will be presented. This will as the user to either return to the main menu or exit the program.

Testing
*The files were subjected to JUnit testing. These tests can be found within the "JUnitTests package"

If you have any problems please email me: prinolan009@gmail.com
