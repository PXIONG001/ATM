# Banking
This project is creating a ATM system that allows you to check your bank account. This project is based on Java, and I plan on replicating this system into C++ later on. 

## The Structure
I created a UML Class diagram and UML entity diagram in which I will upload them into README.md.

### Use Cases
![image](https://github.com/PXIONG001/ATM/blob/master/images/Analysis_%20User_Stories.jpg)

### UML Design
![image](https://github.com/PXIONG001/ATM/blob/master/images/Design_%20ATM.jpg)


## The Design (Updated)
Hello again! I have updated this project and did not update this new design that I made for the program. The reasoning is due to a lot of consideration that made me change this project over and over again. Now, I have this final iteration that I can explain. So in my last design, the program was very complex, and the App file did a lot of work in which it did not need to do. So, I figure that I seperated what java files should be the one that will do which tasks it needs to do. For instance, the deposit, withdraw, and see balance actions should be used in the account controller file to help reduce redundancies and allow the user to access which account that they would like to access. My overall design improves the efficency of the program and helps reduce the complexity of it as well. 

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
