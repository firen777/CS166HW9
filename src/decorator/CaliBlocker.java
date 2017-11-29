/**
 * 
 */
package decorator;

/**
 * @author albertchan
 * problem 4b) Block California Residents.
 *
 */
public class CaliBlocker extends EvalDecorator {

	/**
	 * @param paramH
	 */
	public CaliBlocker(Evaluator paramH) {
		super(paramH);
		// TODO Auto-generated constructor stub
	}

	/**Just return false
	 * @param paramD Student
	 * @return
	 */
	@Override
	public boolean evaluate(Student paramD) {
		System.out.println("No Californian, because reasons.");
		return false;
	}
	
	

}
