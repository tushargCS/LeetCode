# Write your MySQL query statement below
SELECT firstName,lastName,city,state FROM Person left join Address using(personId);
