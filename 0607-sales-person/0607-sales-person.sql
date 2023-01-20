# Write your MySQL query statement below

select name from SalesPerson where sales_id not in (
select sales_id from (select c.com_id,c.name,sales_id from Orders as o inner join Company as c on c.com_id = o.com_id) as t where t.name="RED");
