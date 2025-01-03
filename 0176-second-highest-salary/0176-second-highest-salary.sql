# Write your MySQL query statement below
SELECT 
    IFNULL((SELECT 
				DISTINCT Salary
            FROM employee
            ORDER BY Salary DESC
            LIMIT 1 , 1),
            NULL
	) AS SecondHighestSalary;