package com.senai.cantinaagil;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "produtos")
public class Produto {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private int quantidade;
    private String categoria;


    public Produto(String categoria, int quantidade, double preco, String descricao, String nome, int id) {
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.preco = preco;
        this.descricao = descricao;
        this.nome = nome;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
