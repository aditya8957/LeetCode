# Write your MySQL query statement below

Select e1.employee_id, e1.name,Count(e2.reports_to)
As reports_count, Round(AVG(e2.age)) As average_age
From Employees e1 Join Employees e2
on e1.employee_id = e2.reports_to
group by e1.employee_id, e1.name  order by e1.employee_id

