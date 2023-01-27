package book.repository.com;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import book.model.com.Tutorial;

public interface TutorialRepository extends MongoRepository<Tutorial, String> {
  List<Tutorial> findByTitleContaining(String title);
  List<Tutorial> findByPublished(boolean published);
}
