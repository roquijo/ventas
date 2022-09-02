package com.ventas.ventas.service;

import com.ventas.ventas.model.Cliente;
import com.ventas.ventas.repository.IClienteRepositorio;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteService implements IClienteService{

    @Autowired
    private IClienteRepositorio clienteRepositorio;

    @Override
    public List<Cliente> findAll() {
        return clienteRepositorio.findAll();
    }

    @Override
    public Optional<Cliente> findById(Integer id) {
        return clienteRepositorio.findById(id);
    }

    @Override
    public Cliente create(Cliente cliente) {
        return clienteRepositorio.save(cliente);
    }

    @Override
    public Cliente update(Cliente cliente) {
        return clienteRepositorio.save(cliente);
    }

    @Override
    public void delete(Integer id) {
        clienteRepositorio.deleteById(id);
    }
}
