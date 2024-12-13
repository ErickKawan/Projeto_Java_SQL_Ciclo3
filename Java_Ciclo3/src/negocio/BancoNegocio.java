package negocio;

import apresentacao.Conta;

import java.util.List;

import acessoDados.ContaDAO;

public class BancoNegocio {

    private ContaDAO contaDAO;

    public BancoNegocio() {
        contaDAO = new ContaDAO();
    }

    public void criaConta(Conta c) {
        contaDAO.salvar(c);
    }

    public List<Conta> listaContas() {
        return contaDAO.listar();
    }
}
