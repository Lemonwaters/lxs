package lxs.stu.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lxs
 * @Date 2024/9/4 上午10:20
 * lxs.stu.productservice.controller
 * @注释
 */
@RestController
public class ProductController {
    @GetMapping("/product")
    public String getProduct(@RequestParam String productId) {
        return "Product:"+ productId;
    }
}
