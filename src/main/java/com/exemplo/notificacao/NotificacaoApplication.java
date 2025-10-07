package com.exemplo.notificacao;

import com.exemplo.notificacao.model.Pedido;
import com.exemplo.notificacao.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotificacaoApplication implements CommandLineRunner {

    // A aplicação agora depende apenas do PedidoService
    @Autowired
    private PedidoService pedidoService;

    public static void main(String[] args) {
        SpringApplication.run(NotificacaoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("=== Sistema de Notificação de Pedidos (Refatorado com Observer) ===");

        // A lógica de criação de pedidos dispara as notificações automaticamente
        pedidoService.criarPedido("João", 150.0);
        pedidoService.criarPedido("Maria", 320.0);
        pedidoService.criarPedido("Carlos", 80.0);

        System.out.println("=== Fim da execução ===");
    }
}