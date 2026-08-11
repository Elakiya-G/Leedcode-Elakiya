-- Last updated: 8/11/2026, 4:02:00 PM
# Write your MySQL query statement below
SELECT name
FROM Customer
WHERE referee_id <> 2
   OR referee_id IS NULL;