package com.example.demo.tarefa.repository;

import com.example.tarefa.model.TarefaMongo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TarefaMongoRepository extends MongoRepository<TarefaMongo, String> {}