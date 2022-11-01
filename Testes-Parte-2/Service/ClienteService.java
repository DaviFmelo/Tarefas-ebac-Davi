package Service;

import dao.ClienteDao;
import dao.IClienteDao;

public class ClienteService {

    private IClienteDao iClienteDao;

    public ClienteService(IClienteDao iClienteDao){
        this.iClienteDao = iClienteDao;
    }

    public String salvar(){
        iClienteDao.salvar();
        return "Sucesso";
    }
    public String buscar(){
        iClienteDao.buscar();
        return "Buscando CPF";
    }
    public String excluir(){
        iClienteDao.excluir();
        return "Excluindo usuário";
    }
    public String atualizar(){
        iClienteDao.atualizar();
        return "Atualizando o cadastro";
    }
}
