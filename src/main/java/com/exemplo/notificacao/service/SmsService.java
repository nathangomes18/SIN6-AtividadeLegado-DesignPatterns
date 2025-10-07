package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import com.exemplo.notificacao.model.PedidoObserver;

import org.springframework.stereotype.Service;

@Service
public class SmsService implements PedidoObserver {
    
    @Override
    public void PedidoCriado(Pedido pedido) {
        System.out.println("Enviando SMS para " + pedido.getCliente());
    }
}
