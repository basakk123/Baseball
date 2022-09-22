$("#btnDelete").click(() => {
	deleteById();
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
	
		$.ajax("/stadium/" + id, {
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
