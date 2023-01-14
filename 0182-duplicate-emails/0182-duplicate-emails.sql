# Write your MySQL query statement below
SELECT email as Email
from Person GROUP BY (EMAIL)
HAVING COUNT(EMAIL)>1;
