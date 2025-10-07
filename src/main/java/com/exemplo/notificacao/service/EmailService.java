package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import com.exemplo.notificacao.model.PedidoObserver;

import org.springframework.stereotype.Service;

@Service
public class EmailService implements PedidoObserver{

    @Override
    public void PedidoCriado(Pedido pedido) {
        System.out.println("Enviando e-mail para " + pedido.getCliente());
    }
}
