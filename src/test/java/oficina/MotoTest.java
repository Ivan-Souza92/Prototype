package oficina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotoTest {

    @Test
    void testeMotoClone() throws CloneNotSupportedException {

        Moto moto = new Moto("Honda","Twister","ZZZ-0000","6000",new Proprietario("Ivan","000000"));

        Moto motoClone = moto.clone();
        motoClone.setMarca("Yamaha");
        motoClone.setModelo("Fazer 250");
        motoClone.setPlaca("AAA-0010");

        assertEquals("Moto{marca='Honda', modelo='Twister', placa='ZZZ-0000', KM='6000', proprietario=Proprietario{nome='Ivan', cpf='000000'}}", moto.toString());
        assertEquals("Moto{marca='Yamaha', modelo='Fazer 250', placa='AAA-0010', KM='6000', proprietario=Proprietario{nome='Ivan', cpf='000000'}}", motoClone.toString());
    }
}