Nihar Gupte
1001556441
A ReadMe file that explains how to execute the JUnit code


The JUnit Coding and Testing was done in Eclipse IDE along with the Java code coverage tool of JaCoCo.

The following is some background information before we proceed to the steps:
1. Locate the Source Code Directory in the submitted files.
2. Under Source Code, you shall find 6 files:
	- MainMethodTest.java -> JUnit java file to test main method. Performs program-level testing and achieves edge coverage for all the edges in the program.
	- NonMainMethodsTest.java -> JUnit java file to test the non-main methods. Performs method-level unit testing on each method and achieves edge coverage for that method.
	- Printtokens.java -> The corrected variant of Printtokens.java, with all known faults fixed.
	- original-Printtokens.java -> The original variant of Printtokens.java, with seeded faults.
	- emptyFile.txt -> text file used for input by MainMethodTest.java's main_test2a()
	- test.txt -> text file used for input by MainMethodTest.java's main_test2b()

------------------------------------------------------------ 
     _______.___________. _______ .______     _______.
    /       |           ||   ____||   _  \   /       |
   |   (----`---|  |----`|  |__   |  |_)  | |   (----`
    \   \       |  |     |   __|  |   ___/   \   \    
.----)   |      |  |     |  |____ |  |   .----)   |   
|_______/       |__|     |_______|| _|   |_______/    
------------------------------------------------------------                                                       

The following are the steps to be performed to execute the JUnit code:
1. Open Eclipse IDE on your computer
2. Create a new java project, name it Printtokens
3. Under that project, create a new package under the directory "src". This package shall be named JUnit4Printtokens.
4. Now, import the following files under this package: MainMethodTest.java, NonMainMethodsTest.java, Printtokens.java.
	- You can do this by either creating a new java class by the name of Printtokens.java and new JUnit test cases by the names of MainMethodTest.java and NonMainMethodsTest.java and then copying pasting the contents of the respective files OR
	- You can simply drag and drop the said files under the package "JUnit4Printtokens".
5. Make sure you also import emptyFile.txt and test.txt in the *root directory* of the project. 
	- IMPORTANT: these files should be placed under Printttokens (the project name/root directory). This step is crucial in order to run the MainMethodTest.java or otherwise you will get a FileNotFoundException.
6. Once you have the files in your local eclipse environment correctly set up under the package, 
	- Go to NonMainMethodsTest.java in the package explorer
	- Right click on NonMainMethodsTest.java and select "Coverage As -> 1 JUnit Test"
	- Repeat the same process for MainMethodTest.java
7. Eclipse will now run the code and display the branch coverage report in the "Coverage" tab which appears below by default.
	- Use NonMainMethodsTest.java to generate branch coverage report for the six indidivual methods. You can note 100% coverage for 5 of the methods, and about 96% coverage for the 6th method.
	- Use MainMethodTest.java to generate branch coverage report for the main method. You can note about 95.6% coverage for the entire Printtokens.java, with many methods reporting about 100% coverage.
8. To export these reports, go to File -> Export -> Run/Debug -> Coverage Session and select the coverage session you want to export
	- Choose "HTML report packed in to a zip file" and select the destination where you want this report to be generated.

