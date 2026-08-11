-- Last updated: 8/11/2026, 4:04:07 PM
# Write your MySQL query statement below
SELECT email
FROM person
GROUP BY email
HAVING COUNT(email)>1;