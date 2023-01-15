# Write your MySQL query statement below

# select customer_number from ( ) as temp where cu;

Select customer_number from Orders group by(customer_number) having count(*) = (select max(t.g) from (Select count(*) as g from Orders group by(customer_number)) as t);