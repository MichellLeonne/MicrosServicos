package br.com.alurafood.pagamentos.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pagamentos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Pagamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLong;
	
	@NotNull
	@Positive
	private BigDecimal valorBigDecimal;
	
	@NotBlank
	@Size(max=100)
	private String nome;
	
	@NotBlank
	@Size(max=19)
	private String numero;
	
	@NotBlank
	@Size(max=17)
	private String expiracao;
	
	@NotBlank
	@Size(min=1, max=3)
	private String codigo;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private Status status;
	private Long pedidoID;
	private Long formaPagamentoID;
	

}