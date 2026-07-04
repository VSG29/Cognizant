CREATE TABLE Department (
    DeptID INT PRIMARY KEY,
    DeptName VARCHAR(30)
);

CREATE TABLE EmployeeDepartment (
    EmpID INT,
    DeptID INT
);

SELECT e.Name, d.DeptName
FROM Employee e
JOIN EmployeeDepartment ed
ON e.EmpID = ed.EmpID
JOIN Department d
ON ed.DeptID = d.DeptID;