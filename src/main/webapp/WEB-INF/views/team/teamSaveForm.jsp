<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>
<br />
<br />
<h2 style="text-align: center">팀 등록</h2>
<br />
<br />
<div class="container">
	<form>
		<div class="mb-3 mt-3">
			<div class="d-flex justify-content-center">
				<div style="width: 300px">
					<h5>야구장 이름 :</h5>
					<select class="form-control" id="stadiumselect" name="stadiumselect" required>
						<c:forEach var="stadiumList" items="${stadiumList}">
							<option value="${stadiumList.id}">${stadiumList.name}</option>
						</c:forEach>
					</select>
				</div>
				<div style="width: 300px">
					<h5>팀 이름 :</h5>
					<input id="name" type="text" class="form-control" placeholder="Enter name">
				</div>
			</div>
			<br /> <br />
			<div class="d-flex justify-content-center">
				<button id="btnSave" type="button" class="btn btn-primary">등록</button>
			</div>
		</div>
	</form>
</div>

<script src="/js/team.js"></script>

<%@ include file="../layout/footer.jsp"%>