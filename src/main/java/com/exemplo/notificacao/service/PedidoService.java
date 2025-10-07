package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import com.exemplo.notificacao.model.PedidoObserver;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    private final List<PedidoObserver> observers;

    public PedidoService(List<PedidoObserver> observers) {
        this.observers = observers;
    }

    public void criarPedido(String cliente, double valor) {
        Pedido pedido = new Pedido(cliente, valor);
        System.out.println("Pedido criado para o cliente: " + cliente);
        notificarObservers(pedido);
    }

    private void notificarObservers(Pedido pedido){
        for(PedidoObserver observer : observers){
            observer.PedidoCriado(pedido);

        }
    }
}
