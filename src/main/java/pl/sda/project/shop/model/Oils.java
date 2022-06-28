package pl.sda.project.shop.model;

import jakarta.persistence.*;
import lombok.*;
import pl.sda.project.shop.extra.OilBrands;

import java.math.BigDecimal;
import java.util.Set;

@Setter
@Entity
@Getter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Oils {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;
    @Enumerated(EnumType.STRING)
    protected OilBrands brand;
    protected String density;
    protected String capacity;
    protected BigDecimal price;
    protected Integer quantity;


}
