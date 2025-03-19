# Write your MySQL query satement below
select query_name,
ROUND(avg(cast(rating as decimal)/position),2) AS quality,
ROUND(sum(case when rating<3 then 1 else 0 end)*100/count(*),2) AS poor_query_percentage
 FROM Queries
 GROUP BY query_name;