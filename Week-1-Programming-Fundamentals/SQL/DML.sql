INSERT INTO Employee VALUES
(101,'Rahul','IT',50000),
(102,'Priya','HR',45000),
(103,'Aman','Finance',60000);

UPDATE Employee
SET Salary = 55000
WHERE EmpID = 101;

DELETE FROM Employee
WHERE EmpID = 102;