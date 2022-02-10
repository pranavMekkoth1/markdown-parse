#Lab Report 3 Week 6

##by Pranav Mekkoth


**Copy whole directories with scp -r**

1. Run the command `$ scp -r . cs15lwi22@ieng6.ucsd.edu:~/markdown-parse1` in your terminal to copy the entire directory into your class account. 
   The command will allow you to recusivly copy all the files in the specified directory and copy them into your user account.
  
  ![Image](https://user-images.githubusercontent.com/97641097/153343247-e97422cd-4bb1-48e4-961e-7c1a014f5a3f.png)

2.Next log into your course account and use the mac/linux javac/java commands in order to run the code you just coppied into the server. When you enter the server, 
  make sure to cd into the folder that you specified at the end of the command that you used to coput the repository into github. 
  Use the mac/linux commands to compile and run the code you want: 
  `javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java`,
  `java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest`.

  
  ![Image](https://user-images.githubusercontent.com/97641097/153345609-ea942210-71a7-42cc-aeb8-17ca86b859b3.png)
  
 3. Now, put it all together. Now use what we have learned about running multiple commands at once in Week 1, to run a single command to copy the directory and then run it. 

  //GO TO TA OFFICE HOURS!!

