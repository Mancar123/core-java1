<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Product App</title>
    <style>
        body {
          margin: 0;
          font-family: Arial, sans-serif;
          background-image: url('https://images.lifestyleasia.com/wp-content/uploads/2019/09/24113904/Louis-Vuitton-The-Gardens-Mall-Entrance.jpg');
          background-size: cover;
          background-position: center;
          color: white;
          height: 100vh;
        }

        nav {
          background-color: rgba(0, 0, 0, 0.6);
          padding: 1rem 2rem;
          display: flex;
          align-items: center;
        }

        .nav-left {
          display: flex;
          gap: 1.5rem;
        }

        .nav-left a {
          color: white;
          text-decoration: none;
          font-weight: bold;
          font-size: 1.1rem;
        }

        .content {
          padding-top: 80px;
          text-align: center;
          color:red;
        }

        h1 {
          font-size: 2.5rem;
          margin-bottom: 0.5rem;
        }

        p {
          font-size: 1.2rem;
        }
    </style>
</head>
<body>

<nav>
    <div class="nav-left">
        <a href="#">Amazon</a>
        <a href="Product.jsp">Product</a>
    </div>
</nav>

<div class="content" id="product">
    <h1>Welcome to Our Product Page</h1>
</div>

</body>
</html>
