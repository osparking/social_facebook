package space.bum.social.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Product {
  @Id
  private Long id;
  private String name;
  private String brand;
  private String madein;
  private float price;  
}
