<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>
<br/><br/>
<h2 style="text-align:center">선수 목록</h2>
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
				<th>소속팀 이름</th>
				<th>포지션</th>
				<th>삭제</th> 
			</tr>
		</thead>
		<tbody>
			<c:forEach var="playerList" items="${playerList}">
				<tr>
					<td>${playerList.no}</td>
					<td>${playerList.name}</td>
					<td>${playerList.teamName}</td>
					<td>${playerList.position}</td>
					<td><input id="id" type="hidden" value="${playerList.no}" />
					<input  id="check${playerList.no}" type="checkbox" name="check"></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

<script src="/js/player.js"></script>

<%@ include file="../layout/footer.jsp"%>