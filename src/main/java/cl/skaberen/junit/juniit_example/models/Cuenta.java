package cl.skaberen.junit.juniit_example.models;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cuenta {

    private String persona;
    private BigDecimal saldo;

}
