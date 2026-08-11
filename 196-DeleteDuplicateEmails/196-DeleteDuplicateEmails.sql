-- Last updated: 8/11/2026, 4:03:59 PM
# Write your MySQL query statement below
DELETE p1
FROM person p1,person p2
WHERE p1.email = p2.email
AND p1.id>p2.id;
