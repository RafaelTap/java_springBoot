package edu.rafael.accounts.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@MappedSuperclass // annotation that indicate to spring data JPA framework that this class act as
					// a superclass for all entities always i try extends this base entity class.
@Getter
@Setter
@ToString
public class BaseEntity {

	@Column(updatable = false) // this column can't update.
	private LocalDateTime createdAt;

	@Column(updatable = false) // this column can't update.
	private String createdBy;

	@Column(insertable = false)
	private LocalDateTime updatedAt;

	@Column(insertable = false)
	private String updatedBy;

}

// class that represent metadata of schemas, is important create this class separeted.
