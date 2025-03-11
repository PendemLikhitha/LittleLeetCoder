# Write your MySQL query statement below
select stu.student_id,
       stu.student_name,
       sub.subject_name,
       count(e.subject_name) as attended_exams 
from Students as stu
CROSS JOIN Subjects as sub
LEFT JOIN Examinations as e
on stu.student_id = e.student_id AND sub.subject_name=e.subject_name
group by stu.student_id,stu.student_name,sub.subject_name
order by stu.student_id,stu.student_name,sub.subject_name;