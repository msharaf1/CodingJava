<%--
  Created by IntelliJ IDEA.
  User: menhaj
  Date: 2019-04-24
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>All Ideas!</title>
</head>
<style>
    table {
        border-collapse: collapse;
        width: 100%;
        }
        

        th, td {
            text-align: left;
            padding: 8px;

        }
        th {
            font-size: 25px;
        }
        td {
            font-size: 20px;
        }

        tr:nth-child(even){background-color: #f2f2f2}

        th {
            background-color: #4CAF50;
            color: white;
        }
        button {
            background-color: #555555; /* Green */
            border: none;
            color: white;
            padding: 15px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            cursor: pointer;
        }
        .class h1 {
            font-size: 25px;
        }
</style>
<body>
    <div class="container">
        <h1>All Posted Ideas</h1>


        <table>
            <thead>
            <tr>
                <th>New Idea</th>
                <th>Action</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${posts}" var="post">
                <tr>
                    <td><c:out value="${post.postName}"/></td>

                    <td> 
                        <form Action="/posts/${post.id}" method="POST">
                            <input type="hidden" name="_method" value="delete">
                            <input type="submit" value="Delete"/>
                            <%-- <button type="submit">Delete </button> --%>
                        </form>
                        <a href="/posts/${post.id}">Show ||</a>
                        <a href="/posts/${post.id}/edit">Edit</a> 
                        <%-- <a href="/posts/${post.id}"><button>Show</buttn> </a>
                        <a href="/posts/${post.id}/edit"><button>Edit</button></a>  --%>
                    </td>
                    </tr>
            </c:forEach>

            </tbody>
        </table>
        <a href="/posts/new"><button>New Idea </button></a>
    </div>
</body>
</html>
