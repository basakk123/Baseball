$("#btnDelete").click(() => {
	deleteById()
});

$("#btnSave").click(() => {
	save();
})


function deleteById() {
	let length = $("input[type=checkbox][name='check']:checked").length;
	let id = $("input[type=checkbox][name='check']:checked").val();
	
	if(length == 0){
		alert("삭제할 항목을 선택해주세요");
		return;
	}
	
	if(length > 1){
		alert("하나의 항목만 선택해주세요");
		return;
	}

	$.ajax("/stadium/" + id, {
		type: "DELETE",
		dataType: "json"
	}).done((res) => {
		if (res.code == 1) {
			alert("삭제되었습니다")
			location.href = "/";
		} else {
			alert("삭제 실패");
		}
	});
}

function save() {
	let data = {
		name: $("#name").val()
	};

	$.ajax("/stadium", {
		type: "POST",
		dataType: "json",
		data: JSON.stringify(data),
		headers: {
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("등록되었습니다")
			location.href = "/stadium";
		} else {
			alert("등록 실패");
		}
	});
}

