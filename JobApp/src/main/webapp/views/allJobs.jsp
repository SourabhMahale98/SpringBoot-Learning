<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Job Listings</title>
    <link rel="stylesheet" href="views/css/styles1.css">
</head>
<body>
    <div class="container">
        <div class="header">
            <h1>Job Listings</h1>
            <div class="header-buttons">
                <a href="/addJob" class="btn">Add Job</a>
                <a href="/allJobs" class="btn">Show All Jobs</a>
            </div>
        </div>
        <div class="job-container">
            <c:forEach var="job" items="${jobPosts}">
                <div class="job-card">
                    <div class="job-title">${job.jobTitle}</div>
                    <div class="job-company">${job.companyName}</div>
                    <div class="job-location">${job.location}</div>
                    <div class="job-description">${job.jobDescription}</div>
                </div>
            </c:forEach>
        </div>
    </div>
</body>
</html>
