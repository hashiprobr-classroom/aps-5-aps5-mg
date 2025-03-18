package br.edu.insper.desagil.aps5.insee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTest {
    private Data data;

    @BeforeEach
    void setUp(){
        data=new Data();
    }

    @Test
    void constroi(){
        assertEquals(1,data.getDia());
        assertEquals(1, data.getMes());
        assertEquals(1970, data.getAno());
    }
}
