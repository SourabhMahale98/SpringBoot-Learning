<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List, java.util.ArrayList" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Job</title>
    <link rel="stylesheet" href="views/css/styles.css">
</head>
<body>
    <div class="container">
        <h1>Add Job</h1>
        <form action="handleForm" method="post">
            <div class="form-group">
                <label for="jobTitle">Job Title</label>
                <input type="text" id="jobTitle" name="jobTitle" required>
            </div>
            <div class="form-group">
                <label for="companyName">Company Name</label>
                <input type="text" id="companyName" name="companyName" required>
            </div>
            <div class="form-group">
                <label for="jobDescription">Job Description</label>
                <textarea id="jobDescription" name="jobDescription" rows="4" required></textarea>
            </div>
            <div class="form-group">
                <label for="location">Location</label>
                <input type="text" id="location" name="location" required>
            </div>
            <button type="submit" class="btn">Add Job</button>
        </form>
    </div>
</body>
</html>
