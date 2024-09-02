package one.digitalinnovation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private LocalDate dataDeNascimento;
    private String nome;
    
    public Pessoa(LocalDate dataDeNascimento, String nome) {
        this.dataDeNascimento = dataDeNascimento;
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(dataDeNascimento, LocalDate.now());
    }

}