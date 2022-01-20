# Banking
This project is creating a ATM system that allows you to check your bank account. This project is based on Java, and I plan on replicating this system into C++ later on. 

## The Structure
I created a UML Class diagram and UML entity diagram in which I will upload them into README.md.

### Use Cases
![image](https://github.com/PXIONG001/ATM/blob/master/images/Analysis_%20User_Stories.jpg)

### UML Design
![image](https://github.com/PXIONG001/ATM/blob/master/images/Design_%20ATM.jpg)


## The Design
As I said in the beginning, the whole point of this project is to create a bank account to interact like anyone could do with their average bank account website. To access the interface, you would need to utilize the command line or command prompt in order for the bank account to work. My first intial design did not come with a database because I wanted to create something very basic before I got into the complicated stuff with the database. I was planning to have 6 java files (Checking, Savings, App, Account, Account Controller, and Database) to simplify the program. However, as I kept building the program, I realize that I did not need the Checking and Savings file because it added redundancy, and I realize that I can simpliy the operations easily with the App doing minor calculations. Overall, I am happy with this design and I will do my best to add some modifications, such as adding a new user, and finding ways to make it efficient.

## Database
I did not get a chance to explain about the database design of my bank account database. The database that I used for this project was MySQL. Let me show you a picture of it:
![image](https://github.com/PXIONG001/ATM/blob/master/images/Database_Picture.PNG)
As you can see from the image, the database holds the personal information about the user in which certifies about them. The Checking and Savings account is within the same table with the user in which the program is able to retrieve from the same table.

### Redundancies of the Database Deign
I will admit that it is not the most greatest database design because I did not factor into the design of how the database would look and trying to work with MySQL. One of the biggest redundancies of this database design is having the Checking and Savings Account in the same table. To relieve this issue, we would need to create seperate tables to for both the checking and savings account. (More to come with the explanation of the new database design and a new picture as well). 
