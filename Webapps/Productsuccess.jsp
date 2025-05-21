<!DOCTYPE html>
<html>
<head>
    <title>Product Added</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: url('https://toquoc.mediacdn.vn/280518851207290880/2022/10/10/image001-1665364837568867074079.jpg') no-repeat center center fixed;
            background-size: cover;
            margin: 0;
            padding: 40px 0;
            color: #fff;
        }

        h2 {
            text-align: center;
            color: #ffffff;
            margin-bottom: 30px;
            text-shadow: 1px 1px 4px rgba(0, 0, 0, 0.6);
        }

        .table-container {
            width: 70%;
            margin: auto;
            background-color: rgba(255, 255, 255, 0.95);
            border-radius: 12px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.3);
            overflow: hidden;
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        th, td {
            padding: 16px 20px;
            text-align: left;
        }

        th {
            background-color: #2c3e50;
            color: white;
            font-size: 16px;
        }

        tr:nth-child(even) {
            background-color: #ecf0f1;
        }

        tr:nth-child(odd) {
            background-color: #f9f9f9;
        }

        td {
            color: #2c3e50;
        }
    </style>
</head>
<body>

<h2>Product Successfully Added!</h2>

<div class="table-container">
    <table>
        <tr>
            <th>Field</th>
            <th>Value</th>
        </tr>
        <tr><td>Name</td><td><%= request.getParameter("name") %></td></tr>
        <tr><td>Type</td><td><%= request.getParameter("type") %></td></tr>
        <tr><td>Incoming Price</td><td><%= request.getParameter("incomingPrice") %></td></tr>
        <tr><td>Selling Price</td><td><%= request.getParameter("sellingPrice") %></td></tr>
        <tr><td>MRP</td><td><%= request.getParameter("mrp") %></td></tr>
        <tr><td>Description</td><td><%= request.getParameter("description") %></td></tr>
        <tr><td>Brand</td><td><%= request.getParameter("brand") %></td></tr>
        <tr><td>Quantity</td><td><%= request.getParameter("quantity") %></td></tr>
        <tr><td>Color</td><td><%= request.getParameter("color") %></td></tr>
        <tr><td>Weight</td><td><%= request.getParameter("weight") %></td></tr>
        <tr><td>Manufacture Date</td><td><%= request.getParameter("manufDate") %></td></tr>
        <tr><td>Warranty</td><td><%= request.getParameter("warranty") %></td></tr>
        <tr><td>Return Policy</td>
            <td><%= request.getParameter("returnPolicy") != null ? "Available" : "Not Available" %></td>
        </tr>
    </table>
</div>

</body>
</html>
