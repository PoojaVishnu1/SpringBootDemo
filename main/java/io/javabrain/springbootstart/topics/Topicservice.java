package io.javabrain.springbootstart.topics;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
public class Topicservice {

	private List<Topic> topics = new ArrayList(Arrays.asList(
				new Topic("1","spring","spring desc"),
				new Topic("2","spring12","spring desc12"),
				new Topic("3","spring34","spring desc34")));
	
	public List<Topic> GetAllTopics()
	{
		return topics;
	}
	
    public void addTopic(Topic topic)
    {
    	topics.add(topic);
    }
    
    public Topic getTopic(string id)
    {
    	return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }
	}

