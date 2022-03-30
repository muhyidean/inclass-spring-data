package miu.edu.demo.repo;

import miu.edu.demo.domain.Review;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepo extends CrudRepository<Review,Integer> {
}
