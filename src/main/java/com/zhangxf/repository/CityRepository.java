package com.zhangxf.repository;

import com.zhangxf.domain.City;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface CityRepository extends ElasticsearchRepository<City, Long> {

}