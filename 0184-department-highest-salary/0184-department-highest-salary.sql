# Write your MySQL query statement below
SELECT d.name as Department, e.name as Employee,e.salary as Salary 
FROM 
Employee e JOIN Department d
ON e.departmentId = d.id
WHERE e.salary = (select max(salary) from employee where departmentId=e.departmentId);
