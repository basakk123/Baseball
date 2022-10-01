$("#btnDelete").click(() => {
	deleteAndRegisterOutById();
});

$("#btnSave").click(() => {
	save();
});

function deleteAndRegisterOutById() {
let length = $("input[type=checkbox][name='check']:checked").length;
	let idArr = [];

	if (length == 0) {
		alert("삭제할 항목을 선택해주세요");
		return;
	}

	$("input[type=checkbox][name='check']:checked").each(function() {
		idArr.push($(this).val());
	})

	for (let i = 0; i < idArr.length; i++) {
		let id = idArr[i];

		$.ajax("/player/" + id, {
			type: "POST",
			dataType: "json"
		}).done((res) => {
			if (res.code == 1) {
				location.href = "/player";
			} else {
				alert("삭제 실패");
			}
		});
	}
	alert("퇴출 선수 등록되었습니다");
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