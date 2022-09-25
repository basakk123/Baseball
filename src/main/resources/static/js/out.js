$("#btnSave").click(() => {
	updateReason();
});

function updateReason() {	
	let id = $("#select option:selected").val();
	
	console.log(id);
	
	let data = {
	reason: $("#reason").val()
	};
	
	$.ajax("/out/"+id, {
		type: "PUT",
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
