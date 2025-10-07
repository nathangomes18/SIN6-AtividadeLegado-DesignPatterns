package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import com.exemplo.notificacao.model.PedidoObserver;

import org.springframework.stereotype.Service;

@Service
public class PushService implements PedidoObserver {
    @Override
    public void PedidoCriado(Pedido pedido) {
        System.out.println("Enviando push notification para " + pedido.getCliente());
    }
}
