package com.aulabd2.aulabd2.model;

//POJO - Plain Old Java Object
public class Cliente {
    
    private int id;
    private String nome, cpf;

    //Sobrecarga de construtores
    public Cliente(){

    }

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public Cliente(int id, String nome, String cpf){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public int getId(){
        return id;
    }

    public String getCpf(){
        return cpf;
    }

    public String getNome(){
        return nome;
    }

}
