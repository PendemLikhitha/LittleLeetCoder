SELECT employee_id, department_id 
FROM Employee e1
WHERE primary_flag = 'Y'
OR (
    SELECT COUNT(*) FROM Employee e2 where e1.employee_id = e2.employee_id
) = 1;
