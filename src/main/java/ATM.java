public class ATM {

    public float accountBalance = 0;
    public boolean isAuth = false;
    public boolean isValidatedCard = true;
    public boolean isValidPassword = true;


    public String enterCard() {
        if (isValidatedCard) {
            return "Validated card";
        } else {
            return "Card not validated";
        }
    }

    public String enterPassword() {
        if (isValidatedCard) {
            System.out.println("Enter Password");
            if (isValidPassword) {
                isAuth = true;
                return "Successful login";
            } else {
                return "Wrong password";
            }
        } else {
            return "Enter card first";
        }
    }

    public String deposit(float money) {
        if (isAuth) {
            if (money >= 50 && money <= 50000) {
                accountBalance += money;
                return "Successful deposit";
            } else {
                return "Enter valid amount";
            }
        } else {
            return "Not allowed";
        }
    }

    public String withdraw(float amount) {
        if (isAuth) {
            if (amount <= accountBalance) {
                accountBalance -= amount;
                return "Successful withdraw";
            } else {
                return "Not enough balance";
            }
        } else {
            return "Not allowed";
        }
    }

    public String removeCard() {
        if (isValidatedCard) {
            return "Card removed";
        } else {
            return "Not allowed";
        }
    }

}
