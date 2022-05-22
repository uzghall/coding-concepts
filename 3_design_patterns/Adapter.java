public class Adapter {
    public static void main(String[] args) {
        ExecutePaymentAdapter adapterClient = new ExecutePaymentAdapter(new ExternalSdkAdaptee());
        adapterClient.pay();
        adapterClient.chargeback();
    }

}

interface ExternalSdkInterface {
    void validate();

    void authorize();

    void capture();

    void chargeback();
}

// external class, provided by 3rd party
class ExternalSdkAdaptee implements ExternalSdkInterface {
    public void validate() {
        System.out.println("Validating");
    }

    public void authorize() {
        System.out.println("Authorizing");
    }

    public void capture() {
        System.out.println("Capturing");
    }

    public void chargeback() {
        System.out.println("ChargingBack");
    }
}

interface CreditPaymentTarget {
    void pay();

    void chargeback();
}

class ExecutePaymentAdapter implements CreditPaymentTarget {
    private ExternalSdkInterface executor;

    public ExecutePaymentAdapter(ExternalSdkInterface executor) {
        this.executor = executor;
    }

    public void pay() {
        this.executor.validate();
        this.executor.authorize();
        this.executor.capture();
    }

    public void chargeback() {
        this.executor.validate();
        this.executor.chargeback();
    }
}
