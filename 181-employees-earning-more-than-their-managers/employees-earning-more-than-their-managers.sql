# Write your MySQL query statement below
select e.name as Employee 
from employee e
join employee d
on e.managerId=d.id && e.salary > d.salary;