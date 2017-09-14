package com.srikanth.spring.boot.cassandra.model;

import java.util.HashSet;
import java.util.Set;

import org.springframework.cassandra.core.Ordering;
import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.mapping.Table;

@Table
public class Record {
	@PrimaryKeyColumn(name = "id", ordinal = 0, type = PrimaryKeyType.CLUSTERED, ordering = Ordering.DESCENDING)
	private String name;
	@PrimaryKeyColumn(name = "title", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
	private String displayName;

	@Column
	private Set<String> tags = new HashSet<String>();
	
	public Record(String name, String displayName, Set<String> tags) {
		super();
		this.name = name;
		this.displayName = displayName;
		this.tags = tags;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Set<String> getTags() {
		return tags;
	}

	public void setTags(Set<String> tags) {
		this.tags = tags;
	}
	
	
}
