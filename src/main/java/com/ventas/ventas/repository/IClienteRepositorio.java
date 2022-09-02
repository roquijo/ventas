package com.ventas.ventas.repository;
import com.ventas.ventas.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepositorio extends JpaRepository<Cliente, Integer> {


}
