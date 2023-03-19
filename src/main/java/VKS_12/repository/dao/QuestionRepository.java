package VKS_12.repository.dao;

import VKS_12.model.Question;

import java.util.Collection;
import java.util.List;

public interface QuestionRepository {
    Question get(int id);
    void save(Question question);
    void update(Question question);
    void delete(int id);
    List<Question> getByTopic(String topic);
}
