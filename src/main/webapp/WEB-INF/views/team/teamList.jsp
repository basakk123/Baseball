<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>
<br/><br/>
<h2 style="text-align:center">팀 목록</h2>
<br/><br/>
<div class="container">
	<br />
	<div class="d-flex justify-content-end">
		<div style="width: 300px">
		</div>
	</div>
	<div class="d-flex justify-content-end">
	<button id="btnDelete" type="button">삭제</button>
	</div>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>야구장이름</th>
				<th>삭제</th> 
			</tr>
		</thead>
		<tbody>
			<c:forEach var="teamList" items="${teamList}">
				<tr>
					<td>${teamList.no}</td>
					<td>${teamList.name}</td>
					<td>${teamList.stadiumName}</td>
					<td>
					<input type="checkbox" name="check" value="${teamList.id}">
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

<script src="/js/team.js"></script>

<%@ include file="../layout/footer.jsp"%>