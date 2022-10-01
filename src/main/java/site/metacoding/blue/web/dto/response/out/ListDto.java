package site.metacoding.blue.web.dto.response.out;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ListDto {
	
	private Integer no;
	private Integer id;
	private String name;
	private String teamId;
	private String position;
	private String reason;
	private Timestamp createdAt;
	private String teamName;
}
