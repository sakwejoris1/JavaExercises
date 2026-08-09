public class AutoPolicy {
    private String policyNumber;
    private String makeAndModel;
    private String state;

    public AutoPolicy(String policyNumber, String makeAndModel, String state) {
        this.policyNumber = policyNumber;
        this.makeAndModel = makeAndModel;
        setState(state);
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setState(String state) {
        if (state.equals("CT") || state.equals("MA") || state.equals("ME") ||
            state.equals("NH") || state.equals("NJ") || state.equals("NY") ||
            state.equals("PA") || state.equals("VT")) {
            this.state = state;
        } else {
            System.out.println("Invalid state code: " + state +
                ". Must be a valid northeast state (CT, MA, ME, NH, NJ, NY, PA, VT).");
        }
    }

    public String getState() {
        return state;
    }
}
