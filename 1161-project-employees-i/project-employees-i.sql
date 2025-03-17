# Write your MySQL query statement below
select p.project_id,
ROUND(SUM(e.experience_years)/count(p.employee_id),2) as average_years
FROM Project as p
Left join Employee as e
on p.employee_id=e.employee_id 
group by p.project_id
