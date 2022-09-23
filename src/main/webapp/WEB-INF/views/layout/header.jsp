<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Baseball</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" rel="stylesheet">

</head>
<body>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="/stadium">Baseball</a>
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
				data-bs-target="#collapsibleNavbar">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="collapsibleNavbar">
				<ul class="navbar-nav">
					
							<li class="nav-item"><a class="nav-link" href="/stadium">야구장목록</a></li>
							<li class="nav-item"><a class="nav-link" href="/team">팀목록</a></li>
							<li class="nav-item"><a class="nav-link" href="/player">선수목록</a></li>
							<li class="nav-item"><a class="nav-link" href="/stadium/stadiumSaveForm">야구장등록</a></li>
							<li class="nav-item"><a class="nav-link" href="/team/teamSaveForm">팀등록</a></li>
							<li class="nav-item"><a class="nav-link" href="/player/playerSaveForm">선수등록</a></li>
							<li class="nav-item"><a class="nav-link" href="/playerposition">팀별포지션목록</a></li>
							<li class="nav-item"><a class="nav-link" href="/out">퇴출선수목록</a></li>
							<li class="nav-item"><a class="nav-link" href="/out/outSaveForm">퇴출사유등록</a></li>

				</ul>
			</div>
		</div>
	</nav>