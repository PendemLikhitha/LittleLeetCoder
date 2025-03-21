select ROUND(AVG(order_date=customer_pref_delivery_date)*100,2)
AS immediate_percentage
FROM delivery
Where (customer_id,order_date) IN
(select customer_id,MIN(order_date)
from delivery
GROUP BY customer_id);
