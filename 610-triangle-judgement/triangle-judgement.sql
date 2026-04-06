# Write your MySQL query statement below
-- a+b>c,b+c>a,a+c>b

SELECT x, y, z,
       IF(x + y > z AND x + z > y AND y + z > x, 'Yes', 'No') AS triangle
FROM Triangle;


