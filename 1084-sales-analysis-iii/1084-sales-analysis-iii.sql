# Write your MySQL query statement below

select pd.product_id,pd.product_name  from Product as pd inner join Sales as sl on pd.product_id=sl.product_id
group by (pd.product_id) having min(sl.sale_date)>="2019-01-01" and max(sl.sale_date)<="2019-03-31";