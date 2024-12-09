CREATE TABLE sample1.Empl (
    empno INT PRIMARY KEY,
    ename VARCHAR(50),
    job VARCHAR(50),
    mgr INT,
    hiredate DATE,
    sal DECIMAL(10, 2),
    comm DECIMAL(10, 2),
    deptno INT
);
INSERT INTO sample1.Empl (empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES
(8369, 'SMITH', 'CLERK', 8902, '1990-12-18', 800.00, NULL, 20),
(8499, 'ANYA', 'SALESMAN', 8698, '1991-02-20', 1600.00, 300.00, 30),
(8521, 'SETH', 'SALESMAN', 8698, '1991-02-22', 1250.00, 500.00, 30),
(8566, 'MAHADEVAN', 'MANAGER', 8839, '1991-04-02', 2985.00, NULL, 20),
(8654, 'MOMIN', 'SALESMAN', 8698, '1991-09-28', 1250.00, 1400.00, 30),
(8698, 'BINA', 'MANAGER', 8839, '1991-05-01', 2850.00, NULL, 10),
(8882, 'SHIVANSH', 'MANAGER', 8839, '1991-06-02', 2450.00, NULL, 10),
(8883, 'SCOTT', 'ANALYST', 8566, '1992-12-09', 3000.00, NULL, 20),
(8830, 'AMIR', 'PRESIDENT', NULL, '1991-11-18', 5000.00, NULL, 10),
(8844, 'KULDEEP', 'SALESMAN', 8698, '1991-09-08', 1500.00, 0.00, 30);

select * from sample1.empl;

-- A. Write a query to display ename and sal of employees whose salary is greater than or equal to 2200.

SELECT ename, sal
FROM sample1.empl
WHERE sal >= 2200;

-- B. Write a query to display details of employees who are not getting a commission.
SELECT *
FROM sample1.empl
WHERE comm IS NULL;

-- C. Write a query to display ename and sal of employees whose salary is in the range of 2500 to 4000.
SELECT ename, sal
FROM sample1.empl
WHERE sal BETWEEN 2500 AND 4000;

-- D. Write a query to display the ename, job, and sal of employees who don’t have a manager.
SELECT ename, job, sal
FROM sample1.empl
WHERE mgr IS NULL;

-- E. Write a query to display the name of an employee whose name contains "A" as the third alphabet.
SELECT ename FROM sample1.empl WHERE SUBSTR(ename, 3, 1) = 'A';

-- F. Write a query to display the name of an employee whose name contains "T" as the last alphabet.
SELECT ename 
FROM sample1.empl 
WHERE ename LIKE '%T';


