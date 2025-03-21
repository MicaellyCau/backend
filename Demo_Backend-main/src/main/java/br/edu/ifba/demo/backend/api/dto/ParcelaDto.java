package br.edu.ifba.demo.backend.api.dto;


import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor


public class ParcelaDto {
    private String login;
    private String senha;

    public ParcelaDto(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    
}
