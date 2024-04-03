package br.edu.ifsp.pw3.api.conserto;

import br.edu.ifsp.pw3.api.mecanico.DadosMecanico;
import br.edu.ifsp.pw3.api.veiculo.DadosVeiculo;

public record DadosCadastroConserto(String data_entrada, String data_saida,DadosMecanico mecanico, DadosVeiculo veiculo) {

}
