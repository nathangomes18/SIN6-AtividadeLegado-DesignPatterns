# Changelog

O formato baseado em [Keep a Changelog](https://keepachangelog.com/pt-BR/1.0.0/)

## [1.0.0] - 2025-09-29
### Adicionado
- Nova funcionalidade de notificação quando um pedido é realizado

### Corrigido
- Sem correções

### Modificado
- Sem modificações

## [1.1.0] - 2025-10-06

### Adicionado
- Nova interface que todos os observadores implementarão
### Corrigido
- PedidoService irá manter uma lista dos observers e enviará a notificação toda vez que um pedido for criado
-A classe que era o ponto central de acoplamento foi completamente eliminada. Sua responsabilidade foi distribuída de forma mais inteligente entre o PedidoService e os serviços de notificação
### Modificado
- EmailService, SmsService e PushService se tornaram implementações concretas, deixando de ser classes independentes e foram modificadas para implementar a interface
- Agora, a função do PedidoService.java é criar o pedido e notificar todos os observers registrados, sem precisar saber quem eles são ou o que fazem.
- NotificacaoApplication.java foi simplificada para interagir apenas com o PedidoService