# Write your MySQL query statement below
select name from employee where id IN(Select managerId from Employee
                      group by managerId having   count(managerId)>=5 );