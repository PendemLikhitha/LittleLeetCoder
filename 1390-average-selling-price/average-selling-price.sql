# Write your MySQL query statement below
select p.product_id,IFNULL(RounD(sum(p.price*u.units)/sum(u.units),2),0) AS average_price
From prices as p
LEFT JOIN 
UnitsSold as u
ON p.product_id=u.product_id
AND u.purchase_date BETWEEN p.start_date AND p.end_date
GROUP BY p.product_id;