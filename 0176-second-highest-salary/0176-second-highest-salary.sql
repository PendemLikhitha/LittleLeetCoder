# Write your MySQL query statement below
SELECT MAX(salary) as SecondHighestSalary from Employee
Where salary<(select MAX(SALARY) FROM employee)
LIMIT 1;