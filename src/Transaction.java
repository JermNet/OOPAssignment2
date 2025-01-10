/**
 * This is an interface with the method execute which will be implemented by
 * other classes, "hiding" it, an example of abstraction
 *
 * @author Jeremy D. W.
 * @version 2/22/2024
 */
interface Transaction {

    /**
     * This is an interface method so it doesn't have a body, other classes must
     * implement this method
     *
     * @param amount used to be a simple variable for whatever implements this
     *               method
     */
    void execute(double amount);
}
