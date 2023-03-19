package VKS_12.service;


import VKS_12.model.Question;
import VKS_12.repository.dao.QuestionRepository;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class QuestionService {
    private QuestionRepository questionRepository;
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public Question getRndQuestionByTopic (String topic){
        List<Question> topics = questionRepository.getByTopic(topic);
        int randomNum = ThreadLocalRandom.current().nextInt(0, topics.size());
        return topics.get(randomNum);
    }

}
