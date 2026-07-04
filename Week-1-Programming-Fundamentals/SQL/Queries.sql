SELECT * FROM Employee;

SELECT Name, Salary
FROM Employee
WHERE Salary > 50000;

SELECT Department, AVG(Salary)
FROM Employee
GROUP BY Department;

SELECT MAX(Salary) AS HighestSalary
FROM Employee;