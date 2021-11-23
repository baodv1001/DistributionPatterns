package facade;

import domain.Domain;
import domain.Product;
import dto.ProductDTO;

class ProductDTOAssembler {
    public static ProductDTO makeProduct(Product p) {
        ProductDTO result = new ProductDTO();
        result.name = p.getName();
        result.price = "" + p.getPrice();
        return result;
    }

    public static void updateProduct(ProductDTO dto) {
        Product target = null;
        for (Product p : Domain.products) {
            if (p.getName().equals(dto.name)) {
                target = p;
                break;
            }
        }
        if (target != null) {
            target.setPrice(Double.parseDouble(dto.price));
        }
    }

    public static void makeProduct(ProductDTO dto) {
        Product p = new Product(dto.name, 0);
        p.setPrice(Double.parseDouble(dto.price));
        Domain.products.add(p);
    }
}