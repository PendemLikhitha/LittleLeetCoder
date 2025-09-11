SELECT c.name as Customers 
FROM
Customers c LEFT JOIN Orders o
On c.id = o.customerId
WHERE o.id IS NULL;