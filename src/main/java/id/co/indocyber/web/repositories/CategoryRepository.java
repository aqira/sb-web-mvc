package id.co.indocyber.web.repositories;

import id.co.indocyber.web.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
