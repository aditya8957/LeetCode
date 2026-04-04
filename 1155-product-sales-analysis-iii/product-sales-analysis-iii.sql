# Write your MySQL query statement below
Select product_id, year as first_year , quantity, price from Sales 
where(product_id, year) In (
Select product_id, MIN(year) As first_year from Sales 
group by product_id
);