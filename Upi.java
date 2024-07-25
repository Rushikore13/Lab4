package demo.ptpl;
interface PaymentMethod {
    void makePayment(double amount);
    void printReceipt();
}


class CreditCardPayment implements PaymentMethod {
    
    public void makePayment(double amount) {
        System.out.println("Payment of " + amount + " made using Credit Card.");
    }

    
    public void printReceipt() {
        System.out.println("Credit Card Payment Receipt.");
    }
}


class PayPalPayment implements PaymentMethod {
    
    public void makePayment(double amount) {
        System.out.println("Payment of " + amount + " made using PayPal.");
    }

   
    public void printReceipt() {
        System.out.println("PayPal Payment Receipt.");
    }
}


public class Upi {

	public static void main(String[] args) {
		PaymentMethod creditCardPayment = new CreditCardPayment();
        PaymentMethod payPalPayment = new PayPalPayment();
        
        PaymentMethod[] paymentMethods = {creditCardPayment, payPalPayment};

        double amount = 100.0;
        for (PaymentMethod paymentMethod : paymentMethods) {
            paymentMethod.makePayment(amount);
            paymentMethod.printReceipt();
            System.out.println();
	}

  }
}