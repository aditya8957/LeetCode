# Write your MySQL query statement below
Select distinct teacher_id, Count(distinct subject_id) As cnt
from Teacher Group by teacher_id;