package com.acme.nota_fiscal_worker.rabbitmq;

import com.acme.nota_fiscal_worker.model.NotaFiscal;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class NotaFiscalConsumer {
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final NotaFiscalProducer notaFiscalProducer;

    @RabbitListener(queues = {"nota-fiscal-queue"})
    public void receive(@Payload String message) {
        try {
            NotaFiscal notaFiscal = objectMapper.readValue(message, NotaFiscal.class);
            notaFiscalProducer.send(notaFiscal);
        } catch (JsonProcessingException e) {
            log.error("Erro decodificar nota fiscal: {}", e.getMessage());
        }
        log.info("Received message: {}", message);
    }
}
