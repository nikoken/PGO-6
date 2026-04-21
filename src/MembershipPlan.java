public abstract class MembershipPlan implements Billable {
    private String planCode;
    private String clientName;
    private int months;
    private double baseMonthlyFee;
    private boolean autoRenew;
    public MembershipPlan(String planCode, String clientName, int months, double baseMonthlyFee, boolean autoRenew) {
        this.planCode = planCode;
        this.clientName = clientName;
        this.months = months;
        this.baseMonthlyFee = baseMonthlyFee;
        this.autoRenew = autoRenew;
    }
    public double calculateMonthlyGrossPrice() {
        return calculateMonthlyNetPrice() * 1.23;
    }
    public double calculateTotalNetPrice() {
        return calculateMonthlyNetPrice() * months;
    }
    public final void printSummary() {
        System.out.println("Plan: " + planCode + " | Type: " + getPlanType());
        System.out.println("Client: " + clientName + " | Duration: " + months + " months");
        System.out.println("Monthly Net: " + calculateMonthlyNetPrice() + " PLN");
        System.out.println("Monthly Gross: " + calculateMonthlyGrossPrice() + " PLN");
        System.out.println("Total Contract Net: " + calculateTotalNetPrice() + " PLN");
    }
    public abstract String getPlanType();
    @Override
    public String toString() {
        return "Plan Code: " + planCode + ", Client: " + clientName + ", Duration: " + months + " months";
    }
    protected int getMonths() { return months; }
    protected double getBaseMonthlyFee() { return baseMonthlyFee; }
    protected boolean isAutoRenew() { return autoRenew; }
}