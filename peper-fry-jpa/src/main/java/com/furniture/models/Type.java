package com.furniture.models;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="springtype")
@Getter
@Setter
@ToString
public class Type {
private String type;
@Id
@Column(name="typeid")
@GeneratedValue(generator = "typeseq1",strategy =GenerationType.SEQUENCE )
@SequenceGenerator(name = "typeseq1",sequenceName = "type_seq1",initialValue = 61,allocationSize = 1)
private Integer typeId;

@ManyToOne
@JoinColumn(name="cat_id")
private Category category;

@JsonIgnore
@OneToMany(mappedBy = "type")
private Set<Product> productList;

@Override
public String toString() {
	return "Type [type=" + type + ", category=" + category + "]";
}

}
