package com.ventas.ventas.job;

import com.ventas.ventas.controller.ClienteController;
import com.ventas.ventas.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class ClienteJob {

    @Autowired
    private ClienteService clienteService;

    @Scheduled(fixedRate = 3000)
    public void insertarCliente() {

    }

}
