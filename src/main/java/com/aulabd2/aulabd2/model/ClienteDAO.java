package com.aulabd2.aulabd2.model;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

@Repository
public class ClienteDAO {
    @Autowired DataSource dataSource;
	
	JdbcTemplate jdbc;
	
	@PostConstruct
	private void initialize() {
		jdbc = new JdbcTemplate(dataSource);
	}

    public void inserirCliente(Cliente cli){
        String sql = "INSERT INTO cliente(nome,cpf)" +
        " VALUES (?,?)";
        Object[] obj = new Object[2];
        //primeiro ?
        obj[0] = cli.getNome();
        //segundo ?
        obj[1] = cli.getCpf();
        jdbc.update(sql, obj);
    }

    public List<Map<String, Object>> listarClientes() {
    	String sql = "SELECT * FROM cliente";
    	return jdbc.queryForList(sql);
    }


}
