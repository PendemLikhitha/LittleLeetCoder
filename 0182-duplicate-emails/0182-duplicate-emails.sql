# Write your MySQL query statement below
SELECT email FROM PERSON 
GROUP BY email
HAVING count(*)>1;