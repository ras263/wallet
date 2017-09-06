package entity;

/**
 * Currency value object.
 * Contained in the money objects.
 *
 * Created by Lakhno Anton
 * at 22:28 06.09.17.
 *
 * @author Lakhno Anton
 * @version 1.0.0
 * @since 1.0.0
 */
public class Currency {

	private String name;
	private String shortName;

	public Currency(String name, String shortName) {
		this.name = name;
		this.shortName = shortName;
	}

	public String getName() {
		return name;
	}

	public String getShortName() {
		return shortName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Currency currency = (Currency) o;

		return shortName != null ? shortName.equals(currency.shortName) : currency.shortName == null;
	}

	@Override
	public int hashCode() {
		return shortName != null ? shortName.hashCode() : 0;
	}

	@Override
	public String toString() {
		return "Currency{" +
				"name='" + name + '\'' +
				", shortName='" + shortName + '\'' +
				'}';
	}

}
