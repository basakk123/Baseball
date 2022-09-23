$("#btnDelete").click(() => {
	deleteById();
});

$("#btnSave").click(() => {
	save();
});

function deleteById() {
	let id = $("#id").val();
	
	if($("input:checkbox[name='check']:checked").length == 0){
		 alert("삭제할 항목을 선택해 주세요");
		 return;
	 }
	
	if(!$("#check"+id).is(":checked")){
		return;
	}	
	
		$.ajax("/player/" + id, {
		type: "DELETE",
		dataType: "json" // 응답 데이터
	}).done((res) => {
		if (res.code == 1) {
			location.href = document.referrer;
		} else {
			alert("삭제 실패");
		}
	});
}

function save() {	
	let data = {
	name: $("#name").val(),
	teamId : $("#teamselect option:selected").val(),
	position :$("#position").val()
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
		}else {
			alert("등록 실패");
		}
	});
}