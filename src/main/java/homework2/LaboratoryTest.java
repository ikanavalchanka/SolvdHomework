package homework2;

public class LaboratoryTest {
    private String testName;
    private double cost;

    public LaboratoryTest(String testName, double cost) {
        this.testName = testName;
        this.cost = cost;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
