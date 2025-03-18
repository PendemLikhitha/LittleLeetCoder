# Write your MySQL query statement below
select contest_id,ROUND(count(DISTINCT user_id)*100/(select count(user_id) FROM Users),2)
 AS percentage
FROM Register 
group by contest_id
order by 
percentage DESC,
contest_id ASC;