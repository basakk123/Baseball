package site.metacoding.blue.domain.out;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.blue.web.dto.request.out.UpdateDto;

@NoArgsConstructor
@Setter
@Getter
public class Out {
	private Integer id;
	private Integer playerId;
	private String reason;
	private Timestamp createdAt;
	
	public Out(String reason) {
		this.reason = reason;
	}
	
	public Out(Integer playerId) {
		this.playerId = playerId;
	}
	
	public Out(Integer playerId, String reason) {
		this.playerId = playerId;
		this.reason = reason;
	}
	
	public void update(UpdateDto updateDto) {
		this.reason = updateDto.getReason();
	}
}
