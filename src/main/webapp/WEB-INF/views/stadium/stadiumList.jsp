<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

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
				<th>삭제</th> 
			</tr>
		</thead>
		<tbody>
			<c:forEach var="stadiumList" items="${stadiumList}">
				<tr>
					<td>${stadiumList.no}</td>
					<td>${stadiumList.name}</td>
					<td><input id="id" type="hidden" value="${stadiumList.no}" />
					<input  id="check${stadiumList.no}" type="checkbox" name="check"></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

<script src="/js/stadium.js"></script>

<%@ include file="../layout/footer.jsp"%>