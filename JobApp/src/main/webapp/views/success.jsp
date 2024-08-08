<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.sdm.JobApp.Model.JobPost" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Show All Jobs</title>
    <link rel="stylesheet" href="views/css/styles.css">
</head>
<body>
    <%
        JobPost jobPost = (JobPost) request.getAttribute("jobPost");
    %>
    <div class="container">
            <div class="header">
                <h1>Job Added Details</h1>
                <div class="header-buttons">
                    <a href="/addJob" class="btn">Add Job</a>
                    <a href="/allJobs" class="btn">Show All Jobs</a>
                </div>
            </div>
            <div class="card">
                            <h2><%= jobPost.getJobTitle() %></h2>
                            <p><strong>Company:</strong> <%= jobPost.getCompanyName() %></p>
                            <p><strong>Location:</strong> <%= jobPost.getLocation() %></p>
                            <p><strong>Description:</strong> <%= jobPost.getJobDescription()%></p>
                        </div>
        </div>
</body>
</html>
