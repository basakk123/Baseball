<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>
<br />
<br />
<h2 style="text-align: center">야구장 등록</h2>
<br />
<br />
<div class="container">
	<form>
		<div class="mb-3 mt-3">
			<div class="d-flex justify-content-center">

				<div style="width: 300px">
					<h5>야구장 이름 :</h5>
					<input id="name" type="text" class="form-control" placeholder="Enter the name">
				</div>
			</div>
			<br /> <br />
			<div class="d-flex justify-content-center">
				<button id="btnSave" type="button" class="btn btn-primary">등록</button>
			</div>
		</div>
	</form>
</div>

<script src="/js/stadium.js"></script>

<%@ include file="../layout/footer.jsp"%>