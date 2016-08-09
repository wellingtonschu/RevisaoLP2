package br.edu.ifcriodosul.lp2.montadora;

/**
 * Created by welli on 09/08/2016.
 */
public class MainMontadora {

    public static void main(String[] args) {

        System.out.println("Inicio");
        Pais pais = new Pais();
        pais.setNome("BRASIL");
        pais.setSigla("HUEHUEHUEBR");

        Montadora montadora = new Montadora();
        montadora.setPais(pais);

        Automovel carro = null;

        try {
            carro = montadora.montarCarro(4, TipoMotor.ELETRICO.ordinal());

        } catch (MotorErradoException me) {

            System.out.println("erro: " + me.getMessage());

        } catch (Exception e) {

            System.out.println("Outras exceções");

        } finally {

            System.out.println("Fim programa");

        }

    }

}
