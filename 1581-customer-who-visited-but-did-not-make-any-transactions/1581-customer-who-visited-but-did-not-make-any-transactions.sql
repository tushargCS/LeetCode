# Write your MySQL query statement below
SELECT t1.customer_id,count(*) as count_no_trans  from Visits as t1 where t1.visit_id 
NOT IN
(select t2.visit_id from  Transactions as t2)
group by t1.customer_id