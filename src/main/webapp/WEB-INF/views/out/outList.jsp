<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>
<br/><br/>
<h2 style="text-align:center">퇴출 선수 목록</h2>
<br/><br/>
<div class="container">
	<br />
	<div class="d-flex justify-content-around">
	<c:forEach var="outList" items="${outList}">
	<button id="btnTeam"  type="button" value="${outList.id}">${outList.teamName}</button>
	</c:forEach>
	</div>
	<br />
	<table class="table table-striped">
		<thead>
			<tr>
				<th>번호</th>
				<th>팀 이름</th>
				<th>선수 이름</th>
				<th>포지션</th>
				<th>사유</th>
				<th>퇴출일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="outList" items="${outList}">
				<tr>
					<td>${outList.no}</td>
					<td>${outList.teamName}</td>
					<td>${outList.name}</td>
					<td>${outList.position}</td>
					<td>${outList.reason}</td>
					<td>${outList.createdAt}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

<script src="/js/out.js"></script>

<%@ include file="../layout/footer.jsp"%>