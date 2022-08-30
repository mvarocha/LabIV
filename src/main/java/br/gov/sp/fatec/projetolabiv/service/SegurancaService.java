package br.gov.sp.fatec.projetolabiv.service;

import java.util.List;

import br.gov.sp.fatec.projetolabiv.entity.Usuario;

public interface SegurancaService {

    public Usuario novoUsuario (Usuario usuario);

    public Usuario novoUsuario(String nome, String senha);

    public List<Usuario> listarTodosUsuarios();

    public Usuario buscarUsuarioPorId(Long id);
    
}
