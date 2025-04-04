// Implement custom exception handling for bank transactions.
// 1. Create a `LowBalanceException` (custom exception).
// 2. Create a `BankAccount` class with:
//    - `balance` field.
//    - `withdraw(amount)` method that throws `LowBalanceException` if `balance < amount`.
// 3. In `main`, create an account with a balance of 5000 and try to withdraw 7000.
// 4. Catch and display the exception message.

class LowBalanceException extends Exception {

    LowBalanceException(String message) {
        super(message);
    }
}

class CustomExceptionDemo {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(5000);
        try {
            System.out.println("Balance: " + b1.getBalance());
            System.out.println("Trying to Withdraw 1000");
            b1.withdraw(1000);
            System.out.println("Balance: " + b1.getBalance());
            System.out.println("Trying to Withdraw 7000");
            b1.withdraw(7000);
        } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Final Balance: " + b1.getBalance());
        }
    }
}

class BankAccount {

    private double balance;

    BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws LowBalanceException {
        if (this.balance < amount) {
            throw new LowBalanceException("Balance not sufficient");
        }
        this.balance -= amount;
    }

    public double getBalance() {
        return this.balance;
    }
}
