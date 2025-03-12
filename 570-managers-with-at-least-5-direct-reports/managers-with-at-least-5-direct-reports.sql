# Write your MySQL query statement below
select e.name from Employee as e
INNER JOIN Employee as m 
ON e.id=m.managerId
GROUP BY m.managerId
HAVING count(m.managerId)>=5;