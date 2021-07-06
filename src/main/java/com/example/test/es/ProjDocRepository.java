package com.example.test.es;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
public interface ProjDocRepository extends ElasticsearchRepository<ProjDoc, String>{

	public List<ProjDoc> findByFilename(String filename);

}
