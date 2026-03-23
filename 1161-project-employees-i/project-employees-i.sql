# Write your MySQL query statement below
Select p.project_id, ROund(AVG(e.experience_years),2) As average_years 
    from Project As p Join Employee As e on p.employee_id = e.employee_id
    Group by p.project_id;
