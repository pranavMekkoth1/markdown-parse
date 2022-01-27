# Week 4 Lab Report 
## by Pranav Mekkoth

**Code Change 1**

* Screenshot of the code change:

![Image](https://user-images.githubusercontent.com/97641097/151302386-30e2f546-0172-4150-9ccc-6bfa9aebaffc.png)

* [Link to test file for failure-inducing input](https://github.com/pranavMekkoth1/markdown-parse/blob/main/links_with_extra_chars.md)

  **Note**: the failure inducing input was when there was no links in the file.

* output of running the file at command line at this time:

![Image](https://user-images.githubusercontent.com/97641097/151314429-b202b182-e7fe-4d89-83f1-4c80711552b2.png)

*  The bug in the code was that the program didn't account for if there was other text after the closed parentheses. So, when we tested a file with extra characters (the failure inducing input) it resulted in the error the symptom that was the infinite loop that ran when we ran the java commands in the terminal (the symptom). To fix the issue, we used the an if statment to specify the special case (as seen in item 1 on this list).



**Code Change 2**

*  Screenshots of the changed code:

![Image](https://user-images.githubusercontent.com/97641097/151315359-b7bf0671-5cc2-4506-8815-5ecd7d0dbcb1.png) (from MarkdownParse.md)

![Image](https://user-images.githubusercontent.com/97641097/151312525-dc75a7ea-e4d3-44b9-9189-8ee045d877d9.png) (from nolinks.md)

* [Link to failure-inducing input](https://github.com/pranavMekkoth1/markdown-parse/blob/main/nolinks.md)

* output of running the file at command line at this time:

![Image](https://user-images.githubusercontent.com/97641097/151304327-3c55daae-4641-4285-abea-2ee2deb7e392.png)

* The bug in the code was that the Markdown file had a bit of code that wasn't necessary and we needed to add the same code we did in code change 3. The test input was a file without any links resulted in what is shown in the image from step 3. The fix was made through some minor edits to the markdownparse file



**Code Change 3**

* Screenshot of the code change:

![Image](https://user-images.githubusercontent.com/97641097/151305788-d5b371c8-e731-4786-874d-f7ef42388e05.png) (form MarkdownParse)

![Image](https://user-images.githubusercontent.com/97641097/151313113-6597c9f5-b72d-44cf-a0e8-6d057f1a583b.png) (from the spaces.md)

* [Link to test file for failure-inducing input](https://github.com/pranavMekkoth1/markdown-parse/blob/main/spaces.md)

  **Note**: the failure inducing input was when there was charecters/spaces between the brakets and the open parentheses.
 
* output of running the file at command line at this time:

![Image](https://user-images.githubusercontent.com/97641097/151311880-875d48a4-3e49-42e3-8b77-89e5a73e8d1c.png)

*  The bug in the program was that we didn't account for if there were extra spaces in between the the closed braket and open parrentheses formating of links in the files. The failure inducing input that was having these out of place spaces resulted in the the output in step 3 (the symptom). To fix the issue we specified that for something to be a link, the closed braket and open parenthese must be very close to eachother.

