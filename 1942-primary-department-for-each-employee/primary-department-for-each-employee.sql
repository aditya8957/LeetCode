# Write your MySQL query statement below


Select employee_id, department_id 
From Employee  where primary_flag = 'Y' or (employee_id,department_id ) In(
    Select employee_id,department_id
From Employee 
group by employee_id Having count(employee_id) = 1
)

