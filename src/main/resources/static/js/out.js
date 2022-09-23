$("#btnSave").click(() => {
	save();
});

function save() {	
	let data = {
	name: $("#name").val(),
	teamId : $("#teamselect option:selected").val(),
	position :$("#position").val()
	};

	$.ajax("/out", {
		type: "POST",
		dataType: "json",
		data: JSON.stringify(data), 
		headers: { 
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("등록되었습니다")
			location.href = "/out";
		}else {
			alert("등록 실패");
		}
	});
}