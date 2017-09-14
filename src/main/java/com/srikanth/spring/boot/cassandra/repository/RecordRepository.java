package com.srikanth.spring.boot.cassandra.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;

import org.springframework.stereotype.Repository;

import com.srikanth.spring.boot.cassandra.model.Record;

@Repository
public interface RecordRepository extends CassandraRepository<Record>{

}
