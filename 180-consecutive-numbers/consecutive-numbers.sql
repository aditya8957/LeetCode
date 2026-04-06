# Write your MySQL query statement below
select distinct l1.num As ConsecutiveNums  from
 Logs l1 Join Logs l2 Join Logs l3
 On l1.id = l2.id-1 And l1.id = l3.id-2
 where l1.num = l2.num And l2.num = l3.num;
