package com.movieapp.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="SpringMOrder")
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Order {
	
	@Id
	@GeneratedValue(generator = "ordermseq",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "ordermseq",sequenceName = "orderm_seq",initialValue=50,allocationSize = 2)
	@Column(name="orderid")
	private Integer orderId;
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;
	@OneToOne
	@JoinColumn(name="movie_id")
	private Movie movie;
	
	@Column(name="ticketcount")
	private Integer ticketCount;
	
	@Column(name="paymentmode")
    private String paymentMode;

	@Column(name="totalprice")
	private Double totalPrice;

	public Order(User user, Movie movie, Integer ticketCount, String paymentMode, Double totalPrice) {
		super();
		this.user = user;
		this.movie = movie;
		this.ticketCount = ticketCount;
		this.paymentMode = paymentMode;
		this.totalPrice = totalPrice;
	}


}
