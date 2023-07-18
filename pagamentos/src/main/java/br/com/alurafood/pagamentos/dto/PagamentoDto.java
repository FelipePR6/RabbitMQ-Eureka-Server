package br.com.alurafood.pagamentos.dto;

import br.com.alurafood.pagamentos.model.Status;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class PagamentoDto

//(Long id,
//        BigDecimal valor,
//        String nome,
//        String numero,
//        String expiracao,
//        String codigo,
//        Status status,
//        Long formaDePagamentoId,
//        Long pedidoId)
{
    private Long id;
    private BigDecimal valor;
    private String nome;
    private String numero;
    private String expiracao;
    private String codigo;
    private Status status;
    private Long formaDePagamentoId;
    private Long pedidoId;
}
