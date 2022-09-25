$("#btnDelete").click(() => {
	deleteById();
	//outById();
	//deletetest();
});

$("#btnSave").click(() => {
	save();
});

function deletetest() {
	let length = $("input[type=checkbox][name='check']:checked").length;
	let id = $("input[type=checkbox][name='check']:checked").val();

	if (length == 0) {
		alert("삭제할 항목을 선택해주세요");
		return;
	}

	if (length > 1) {
		alert("하나의 항목만 선택해주세요");
		return;
	}

	$.ajax("/player/" + id, {
		type: ("DELETE", "POST"),
		dataType: "json",
		data: JSON.stringify(id),
		headers: {
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("삭제되었습니다")
			location.href = "/player";
		} else {
			alert("삭제 실패");
		}
	});
}

function deleteById() {
	let length = $("input[type=checkbox][name='check']:checked").length;
	let id = $("input[type=checkbox][name='check']:checked").val();

	if (length == 0) {
		alert("삭제할 항목을 선택해주세요");
		return;
	}

	if (length > 1) {
		alert("하나의 항목만 선택해주세요");
		return;
	}

	$.ajax("/player/" + id, {
		type: "DELETE",
		dataType: "json" // 응답 데이터
	}).done((res) => {
		if (res.code == 1) {
			alert("삭제되었습니다")
			location.href = "/player";
		} else {
			alert("삭제 실패");
		}
	});
}

function outById() {
	let id = $("input[type=checkbox][name='check']:checked").val();

	$.ajax("/player/" + id, {
		type: "POST",
		dataType: "json",
		data: JSON.stringify(id),
		headers: {
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("퇴출 선수 등록되었습니다")
		} else {
			alert("등록 실패");
		}
	});
}

function save() {
	let data = {
		name: $("#name").val(),
		teamId: $("#teamselect option:selected").val(),
		position: $("#position").val()
	};

	$.ajax("/player", {
		type: "POST",
		dataType: "json",
		data: JSON.stringify(data),
		headers: {
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("등록되었습니다")
			location.href = "/player";
		} else {
			alert("등록 실패");
		}
	});
}