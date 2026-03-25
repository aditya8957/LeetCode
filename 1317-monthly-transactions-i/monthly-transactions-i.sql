# Write your MySQL query statement below
Select 
    Date_Format(trans_date, '%Y-%m') As month,
    country,
    Count(id) As trans_count,
    Sum(state = 'approved') As approved_count,
    Sum(amount) As trans_total_amount,
    Sum(If(state = 'approved',amount,0)) As approved_total_amount

From Transactions 
Group By  month, country;