# Write your MySQL query statement below



Select Round(Count(player_id)/(Select  Count(distinct player_id) from Activity),2)
As fraction
From Activity
where(player_id, Date_Sub(event_date, Interval 1 Day)) In (
Select player_id, MIN(event_date) 
from Activity group by player_id
);