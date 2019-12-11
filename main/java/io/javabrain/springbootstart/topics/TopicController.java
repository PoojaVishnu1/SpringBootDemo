package io.javabrain.springbootstart.topics;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private Topicservice topicservice;
	
	@RequestMapping("/topics")
	public List<Topic> GetAllTopics(){
	return topicservice.GetAllTopics();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicservice.addTopic(topic);
	}
}
