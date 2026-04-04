# Write your MySQL query statement below
Select distinct activity_date  As day, Count(distinct user_id)
As active_users from Activity
WHERE activity_date Between '2019-06-28' And '2019-07-27'
GROUP BY activity_date;