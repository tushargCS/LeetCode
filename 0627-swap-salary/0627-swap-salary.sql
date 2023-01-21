# Write your MySQL query statement below
update Salary set
sex=(
case sex
    When 'f' then 'm'
    when 'm' then 'f'
    end);