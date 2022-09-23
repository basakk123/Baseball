package site.metacoding.blue.domain.out;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Out {
	private Integer id;
	private Integer playerId;
	private String reason;
	private Timestamp createdAt;

}
