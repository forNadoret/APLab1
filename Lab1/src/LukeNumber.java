/**
 * The LukeNumber class represents a single Lucas number for a given index n.
 * It calculates the Lucas number for negative and non-negative n using the formula:
 * L0 = 2, L1 = 1, L(-n) = (-1)^n * L(n)
 */
public class LukeNumber {

    /** Index of the Lucas number */
    private int n;

    /** Value of the Lucas number for the given index n */
    private int value;

    /**
     * Constructor of the LukeNumber class.
     * Creates an object and calculates the Lucas number for the given index n.
     */
    public LukeNumber(int n) {
        this.n = n;
        this.value = calculate();
    }

    /**
     * Calculates the Lucas number for the current index n.
     */
    private int calculate() {
        int prevNum = 2;
        int curNum = 1;
        int k = Math.abs(this.n);

        for (int i = 2; i <= k; i++) {
            int temp = curNum;
            curNum = curNum + prevNum;
            prevNum = temp;
        }

        return (int) Math.pow(-1, k) * curNum;
    }

    /**
     * Returns the value of the Lucas number.
     */
    public int getValue() {
        return this.value;
    }

    /**
     * Sets a new index n and recalculates the corresponding Lucas number.
     */
    public void setN(int n) {
        this.n = n;
        this.value = calculate();
    }

    /**
     * Returns the index n of the Lucas number.
     */
    public int getN() {
        return this.n;
    }
}
