# Write your MySQL query state
SELECT unique_id,name FROM Employees LEFT JOIN EmployeeUNI ON Employees.id=EmployeeUNI.id ;