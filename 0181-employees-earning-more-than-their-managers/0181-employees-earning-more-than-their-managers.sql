# Write your MySQL query statement below
SELECT e1.name as Employee from Employee as e1 cross join Employee as e2 where e1.managerId = e2.id AND e1.salary > e2.salary ;