
import java.time.LocalDate;

public class Customer implements IEntity{
	private String nationalityId;
	private String firstName;
	private String lastName;
	private LocalDate localDate;

	public Customer(String nationalityId, String firstName, String lastName, LocalDate localDate) {
		this.nationalityId = nationalityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.localDate = localDate;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

}
