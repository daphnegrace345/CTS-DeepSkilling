-- Scenario 1: Discount for Customers Above 60

DECLARE
BEGIN
    FOR c IN (SELECT CustomerID, Age FROM Customers) LOOP
        IF c.Age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = c.CustomerID;
        END IF;
    END LOOP;

    COMMIT;
END;
/

-- Scenario 2: Set VIP Status

DECLARE
BEGIN
    FOR c IN (SELECT CustomerID, Balance FROM Customers) LOOP
        IF c.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = c.CustomerID;
        END IF;
    END LOOP;

    COMMIT;
END;
/

-- Scenario 3: Loan Reminder

DECLARE
BEGIN
    FOR l IN (
        SELECT CustomerID, LoanDueDate
        FROM Loans
        WHERE LoanDueDate BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan due for Customer ID ' || l.CustomerID
        );
    END LOOP;
END;
/