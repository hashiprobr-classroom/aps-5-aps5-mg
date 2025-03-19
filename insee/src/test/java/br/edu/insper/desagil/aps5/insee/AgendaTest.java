package br.edu.insper.desagil.aps5.insee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AgendaTest {
    private Agenda agenda;
    private Evento evento;


    @BeforeEach
    void setUp(){
        agenda=new Agenda();
        evento=mock(Evento.class);

    }

    @Test
    void constroi(){
        when(evento.valido()).thenReturn(Boolean.TRUE);
        assertEquals(new ArrayList<>(), agenda.getEventos());
    }
    @Test
    void adicionaValido(){
        when(evento.valido()).thenReturn(Boolean.TRUE);
        List<Evento> lista= new ArrayList<>();
        lista.add(evento);
        agenda.adiciona(evento);
        assertEquals(lista, agenda.getEventos());
    }
    @Test
    void adicionaInvalido(){
        when(evento.valido()).thenReturn(Boolean.FALSE);

        IllegalArgumentException erro = assertThrows(IllegalArgumentException.class,  () -> {
            agenda.adiciona(evento);

        });


        assertEquals("Evento inválido!", erro.getMessage());
    }
}
