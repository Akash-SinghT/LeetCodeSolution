# Write your MySQL query statement below
select s.year,s.price,product_name
from Sales s
join Product p
on p.product_id = s.product_id