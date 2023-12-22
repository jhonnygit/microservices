package academy.digital.store.product.entity;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name="tbl_products")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String description;
	private Double stock;
	private Double price;
	private String Status;
	
	@Column(name="create_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createAt;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="category_id")
	private Category category;

}
