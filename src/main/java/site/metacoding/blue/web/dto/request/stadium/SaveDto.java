package site.metacoding.blue.web.dto.request.stadium;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.blue.domain.stadium.Stadium;

@NoArgsConstructor
@Setter
@Getter
public class SaveDto {
	
	private String name;

	public Stadium toEntity() {
		Stadium stadium = new Stadium(this.name);
		return stadium;
	}
}
