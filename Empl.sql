CREATE TABLE Empl (
    empno INT PRIMARY KEY,
    ename VARCHAR(50),
    job VARCHAR(50),
    mgr INT,
    hiredate DATE,
    sal DECIMAL(10, 2),
    comm DECIMAL(10, 2),
    deptno INT
);


INSERT INTO Empl (empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES
(8369, 'SMITH', 'CLERK', 8902, '1990-12-18', 800.00, NULL, 20),
(8499, 'ANYA', 'SALESMAN', 8698, '1991-02-20', 1600.00, 300.00, 30),
(8521, 'SETH', 'SALESMAN', 8698, '1991-02-22', 1250.00, 500.00, 30),
(8566, 'MAHADEVAN', 'MANAGER', 8839, '1991-04-02', 2985.00, NULL, 20),
(8654, 'MOMIN', 'SALESMAN', 8698, '1991-09-28', 1250.00, 1400.00, 30),
(8698, 'ΒΙΝΑ', 'MANAGER', 8839, '1991-05-01', 2850.00, NULL, 30),
(8882, 'SHIVANSH', 'ANALYST', 8566, '1992-12-09', 3000.00, NULL, 20),
(8888, 'SCOTT', 'PRESIDENT', NULL, '1991-11-18', 5000.00, NULL, 10),
(8839, 'AMIR', 'SALESMAN', 8698, '1991-09-08', 1500.00, 0.00, 30),
(8844, 'KULDEEP', 'MANAGER', 8839, '1991-06-09', 2450.00, NULL, 10);


SELECT ename, sal 
FROM Empl 
WHERE sal >= 2200;


SELECT * 
FROM Empl 
WHERE comm IS NULL;


SELECT ename, sal 
FROM Empl 
WHERE sal NOT BETWEEN 2500 AND 4000;


SELECT ename, job, sal 
FROM Empl 
WHERE mgr IS NULL;


SELECT ename 
FROM Empl 
WHERE ename LIKE '__A%';


SELECT ename 
FROM Empl 
WHERE ename LIKE '%T';


-- 2nd table
CREATE TABLE Employee (
    empcode INT PRIMARY KEY,
    empname VARCHAR(50),
    empage INT,
    esalary DECIMAL(10, 2)
);

