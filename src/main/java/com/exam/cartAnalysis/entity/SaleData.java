package com.exam.cartAnalysis.entity;

import com.exam.common.entity.Goods;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Entity
@Table(name="sale_data")
public class SaleData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long salesId;

	@ManyToOne
			@JoinColumn(name="orders_id")
	Orders orders;

	@ManyToOne
	@JoinColumn(name="goods_id")
	Goods goods;

	Long saleAmount;
	Long salePrice;

	@CreationTimestamp
	@Column(updatable = false)
	LocalDateTime saleDate;

}
