package id.co.indocyber.web.controllers;

import id.co.indocyber.web.models.Category;
import id.co.indocyber.web.repositories.CategoryRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("categories",
                categoryRepository.findAll(
                        Sort.by(Sort.Direction.ASC, "id")
                ));
        return "category/index";
    }

    @PostMapping("insert")
    public String insert(Category category) {
        categoryRepository.save(category);
        return "redirect:/categories";
    }
}
