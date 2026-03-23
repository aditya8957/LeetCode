# Write your MySQL query statement below
select r.contest_id, Round(Count(r.user_id)*100.0/(SELECT COUNT(*) FROM Users),2)
 As percentage
    from Users as u Join
        Register as r On u.user_id = r.user_id
        Group By r.contest_id Order By percentage Desc, r.contest_id Asc;