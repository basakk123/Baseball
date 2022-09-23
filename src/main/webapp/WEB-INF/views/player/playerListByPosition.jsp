<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>
<br/><br/>
<h2 style="text-align:center">팀별 포지션 목록</h2>
<br/><br/>
<div class="container">
	<br />

	<table class="table table-striped">
		<thead>
			<tr>
				<th>포지션</th>
				<th>두산</th>
				<th>NC</th>
				<th>롯데</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="playerListByPostion" items="${playerListByPostion}">
				<tr>
					<td>${playerListByPostion.position}</td>
					<td>${playerListByPostion.doosan}</td>
					<td>${playerListByPostion.nc}</td>
					<td>${playerListByPostion.lotte}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

<script src="/js/player.js"></script>

<%@ include file="../layout/footer.jsp"%>