package njpi.soso.servicePackage;
/**
 * @author soethihahlaing
 * @mail soethihahlaing@gmail.com
 */
public  abstract class ServicePackage
{
	 private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public abstract void showInfo();
}
