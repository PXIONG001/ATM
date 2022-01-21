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
I did not get a chance to explain about the database design of my bank account database. For some context, I used a relationsal database called MySQL. Here is an image of my table within the database:
![image](https://github.com/PXIONG001/ATM/blob/master/images/Database_Picture.PNG)
As you can see from the image, the table holds the personal information about the user in which certifies about them. The Checking and Savings account is within the same table with the user in which the program is able to retrieve from it.

### Redundancies of the Database Deign
My original database design had redundancies because I did not factor into the design of the data model and trying to work with MySQL with my java program. One of the biggest redundancies of the original database design is having the Checking and Savings Account in the same table. Another issue is having the user's personal information and user account information being combined in which it causes complexity of the data model. To relieve these issues, we would need to create seperate tables to resolve this conflict in which we need database design (a topic that I am still trying to learn and get a grasp on). Please read the next header below.

## New Database Design 
My new database design has been finalized! It's time to execute........order 66! Just kidding! But seriously, it is time to execute the implementation of this new database design. First, here is the image:
![image](https://github.com/PXIONG001/ATM/blob/master/images/Bank_Account.jpg)
Second, let me explain the design to you. There will be four tables: table_customer, table_user, table_savings, and table_checking. table_customer is where the customer's personal information will be stored, table_user is the customer's account information to access their account, table_savings is the user's savings account, and table_checking is the user's checking account. As I have said about the redundancies in the previous header, this database design has relieve them.

# Sources
## Database
- https://www.tutorialspoint.com/how-to-sql-insert-items-from-a-list-or-collection-in-to-table-using-jdbc
- https://www.tutorialspoint.com/jdbc/jdbc-update-records.htm
