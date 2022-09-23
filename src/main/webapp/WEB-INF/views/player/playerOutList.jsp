<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>
<br/><br/>
<h2 style="text-align:center">퇴출 선수 목록</h2>
<br/><br/>
<div class="container">
	<br />
	<div class="d-flex justify-content-around">
	<button id="btnDoosan"  type="button">두산</button>
	<button id="btnNC"  type="button">NC</button>
	<button id="btnLotte"  type="button">롯데</button>
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
			<c:forEach var="playerOutList" items="${playerOutList}">
				<tr>
					<td>${playerOutList.no}</td>
					<td>${playerOutList.doosan}</td>
					<td>${playerOutList.nc}</td>
					<td>${playerOutList.lotte}</td>
					<td>${playerOutList.name}</td>
					<td>${playerOutList.position}</td>
					<td>${playerOutList.reason}</td>
					<td>${playerOutList.createdAt}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

<script src="/js/player.js"></script>

<%@ include file="../layout/footer.jsp"%>