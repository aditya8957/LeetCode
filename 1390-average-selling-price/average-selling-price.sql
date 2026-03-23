# Write your MySQL query statement below
Select p.product_id, ROUND(
        IFNULL(SUM(p.price * u.units) / SUM(u.units), 0),2)
            As average_price
            from Prices As p
            Left Join UnitsSold As u On (p.product_id = u.product_id AND
            u.purchase_date BETWEEN p.start_date AND p.end_date) Or u.purchase_date Is Null
            Group By p.product_id
            