package com.aulabd2.aulabd2.model;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    
    @Autowired ClienteDAO cdao;

    public void inserirCliente(Cliente cli){
        cdao.inserirCliente(cli);
    }

    public List<Map<String, Object>> listarClientes(){
        return cdao.listarClientes();
    }

}
