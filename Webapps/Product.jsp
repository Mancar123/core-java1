<!DOCTYPE html>
<html lang="en" xmlns:align="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Add Product</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-image: url('https://toquoc.mediacdn.vn/280518851207290880/2022/10/10/image001-1665364837568867074079.jpg');
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            margin: 0;
            padding: 0;
        }

        .container {
            max-width: 600px;
            margin: 40px auto;
            background: rgba(255, 255, 255, 0.95); /* Slight transparency */
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        }

        h2 {
            text-align: center;
            margin-bottom: 20px;
        }

        label {
            display: block;
            margin-top: 15px;
            margin-bottom: 5px;
            font-weight: bold;
        }

        input[type="text"],
        input[type="number"],
        input[type="date"],
        select,
        textarea {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        textarea {
            resize: vertical;
            height: 80px;
        }

        .checkbox {
            display: flex;
            align-items: center;
            margin-top: 10px;
        }

        .checkbox input {
            margin-right: 10px;
        }

        button {
            width: 100%;
            padding: 10px;
            margin-top: 20px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 4px;
            font-size: 16px;
            cursor: pointer;
        }

        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

<div class="container">
    <h1 style="background-color:aqua" align:center>${message}</h1>

    <form action="Product" method="post">
        <label for="name">Name</label>
        <input type="text" id="name" name="name" required>

        <label for="type">Type</label>
        <select id="type" name="type" required>
            <option value="">Select Type</option>
            <option value="Electronics">Electronics</option>
            <option value="Clothing">Clothing</option>
            <option value="Grocery">Grocery</option>
            <option value="Home">Home</option>
        </select>

        <label for="incomingPrice">Incoming Price</label>
        <input type="number" id="incomingPrice" name="incomingPrice" step="0.01" required>

        <label for="sellingPrice">Selling Price</label>
        <input type="number" id="sellingPrice" name="sellingPrice" step="0.01" required>

        <label for="mrp">MRP</label>
        <input type="number" id="mrp" name="mrp" step="0.01" required>

        <label for="description">Description</label>
        <textarea id="description" name="description" required></textarea>

        <label for="brand">Brand</label>
        <input type="text" id="brand" name="brand">

        <label for="quantity">Quantity</label>
        <input type="number" id="quantity" name="quantity" required>

        <label for="color">Color</label>
        <select id="color" name="color">
            <option value="">Select Color</option>
            <option value="Red">Red</option>
            <option value="Blue">Blue</option>
            <option value="Black">Black</option>
            <option value="White">White</option>
        </select>

        <label for="weight">Weight (kg)</label>
        <input type="number" id="weight" name="weight" step="0.01">

        <label for="manufDate">Manufacture Date</label>
        <input type="date" id="manufDate" name="manufDate" required>

        <label for="warranty">Warranty</label>
        <select id="warranty" name="warranty">
            <option value="">Select Warranty</option>
            <option value="No Warranty">No Warranty</option>
            <option value="6 Months">6 Months</option>
            <option value="1 Year">1 Year</option>
            <option value="2 Years">2 Years</option>
        </select>

        <div class="checkbox">
            <input type="checkbox" id="returnPolicy" name="returnPolicy">
            <label for="returnPolicy">Return Policy Available</label>
        </div>

        <button type="submit">Submit Product</button>
    </form>
</div>

</body>
</html>
