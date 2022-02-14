package user;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table("name = users")
@Data
public class User {

	@Id
	@GenerateValue(strategy = GenerationType.AUTO)
	private long id;
	
}
