package br.edu.ifcriodosul.lp2.montadora;

import java.util.ArrayList;

/**
 * Created by welli on 09/08/2016.
 */
public class Montadora {

    private String nome;
    private String endereco;
    private String cnpj;
    private String telefone;
    private Pais pais;

    public Carro montarCarro(int nroRodas, int tipoMotor) throws MotorErradoException{

        Carro saida = null;
        //Construir rodas
        saida = new Carro();
        saida.setRodas(new ArrayList<Roda>());
        for (int i = 0; i < nroRodas; i++){

            Roda r = new Roda();
            r.setCodigo("13Rt");
            r.setTamanho(13);
            saida.getRodas().add(r);

        }
        //
        Motor m = null;
        switch (tipoMotor){
            case 0:
                m = new MotorAlcool();
                break;
            case 1:
                m = new MotorDiesel();
                break;
            case 2:
                m = new MotorEletrico();
                break;
            case 3:
                m = new MotorFlex();
                break;
            case 4:
                m = new MotorGas();
                break;
            case 5:
                m = new MotorGasolina();
                break;
            default:
                throw new MotorErradoException("Escolha o tipo certo");
        }

        saida.setMotor(m);

        return saida;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
