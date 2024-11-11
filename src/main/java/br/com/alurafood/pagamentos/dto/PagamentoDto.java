package br.com.alurafood.pagamentos.dto;

import java.math.BigDecimal;

import br.com.alurafood.pagamentos.model.Status;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PagamentoDto {

	private Long idLong;
	private BigDecimal valorBigDecimal;
	private String nome;
	private String numero;
	private String expiracao;
	private String codigo;
	private Status status;
	private Long pedidoID;
	private Long formaPagamentoID;
	
}
