# Write your MySQL query statement below
-- Select *
-- From Delivery where order_date = customer_pref_delivery_date
Select  Round(Sum(If(order_Date = customer_pref_delivery_date,1,0))*100/count(customer_id),2)
As immediate_percentage
From Delivery
where(customer_id,order_Date)
In (Select customer_id,MIN(order_Date) As d
From Delivery 
group by customer_id) 