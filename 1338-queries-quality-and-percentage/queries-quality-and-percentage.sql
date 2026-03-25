# Write your MySQL query statement below
Select query_name , Round(AVG(rating/position),2) As quality,
ROUND(
        SUM(If(rating < 3, 1, 0)) * 100.0 / COUNT(*),
        2
    ) 
As poor_query_percentage from Queries Group By query_name