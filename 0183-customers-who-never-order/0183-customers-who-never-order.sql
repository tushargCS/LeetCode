# Write your MySQL query statement below

SELECT name as Customers from Customers where Customers.id not in (SELECT c.id from Customers as c inner join Orders as o on c.id=o.customerId);

