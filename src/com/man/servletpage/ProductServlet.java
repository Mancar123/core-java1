package com.man.servletpage;

import com.man.dto.ProductDto;
import com.man.serve.ProductService;
import com.man.serve.ProductserviceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Product",loadOnStartup = 1)
public class ProductServlet extends HttpServlet {

@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
    String name = request.getParameter("name");
    String type = request.getParameter("type");
    double incomingPriceStr = Double.parseDouble(request.getParameter("incomingPrice"));
    double sellingPriceStr = Double.parseDouble(request.getParameter("sellingPrice"));
    double mrpStr = Double.parseDouble(request.getParameter("mrp"));
    String description = request.getParameter("description");
    String brand = request.getParameter("brand");
    int quantityStr = Integer.parseInt(request.getParameter("quantity"));
    String color = request.getParameter("color");
    double weightStr = Double.parseDouble(request.getParameter("weight"));
    String manufDate = request.getParameter("manufDate");
    String warranty = request.getParameter("warranty");
    boolean returnPolicyStr = Boolean.parseBoolean(request.getParameter("returnPolicy"));

    ProductDto productDto=new ProductDto();

    productDto.setBrand(brand);
    productDto.setName(name);
    productDto.setType(type);
    productDto.setColor(color);
    productDto.setDescription(description);
    productDto.setIncomingPrice(incomingPriceStr);
    productDto.setManufDate(manufDate);
    productDto.setMrp(mrpStr);
    productDto.setQuantity(quantityStr);
    productDto.setWarranty(warranty);
    productDto.setWeight(weightStr);
    productDto.setSellingPrice(sellingPriceStr);
    productDto.setReturnPolicy(returnPolicyStr);

    ProductService productService=new ProductserviceImpl();
    boolean saved=productService.save(productDto);
    if (saved) {


        RequestDispatcher dispatcher =
                request.getRequestDispatcher("Productsuccess.jsp");
        dispatcher.forward(request, response);
        request.setAttribute("message", "Save Success");
        request.setAttribute("productDto", productDto);
    } else {
        request.setAttribute("message", "Saving of products Failed");
        RequestDispatcher dispatcher =
                request.getRequestDispatcher("Product.jsp");
        dispatcher.forward(request, response);
    }


}
}



