package com.daniel.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Car {

	@Id
	@Getter @Setter private String _id;
	
	@Getter @Setter private String car_id;

	@Getter @Setter private String title;
	@Getter @Setter private String brand;
	@Getter @Setter private String price;
	@Getter @Setter private Integer age;
	
	@LastModifiedDate
	private Date data;
	

}
