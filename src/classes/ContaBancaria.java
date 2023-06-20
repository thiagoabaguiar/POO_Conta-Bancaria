package classes;

public class ContaBancaria {

    // atributos
    private int numConta;
    private String tipoConta;
    private String titularConta;
    private float saldoConta;
    private boolean contaAberta;
    private float valorMensalCC, valorMensalCP;

    // construtor
    public ContaBancaria(int numConta, String tipoConta, String titularConta) {

        this.numConta = numConta;
        this.tipoConta = tipoConta;
        this.titularConta = titularConta;
        this.saldoConta = 0.00f;
        this.contaAberta = false;
        this.valorMensalCC = 12.00f;
        this.valorMensalCP = 20.00f;

    }

    // getters
    public int getNumConta() {

        return this.numConta;

    }

    public String getTipoConta() {

        return this.tipoConta;

    }

    public String getTitularConta() {

        return this.titularConta;

    }

    public float getSaldoConta() {

        return this.saldoConta;

    }

    public boolean isContaAberta() {

        return this.contaAberta;

    }
    
    public float getValorMensalCC(){
    
        return this.valorMensalCC;
        
    }
    
    public float getValorMensalCP(){
    
        return this.getValorMensalCP();
    
    }

    // setters
    public void setContaAberta(boolean contaAberta) {

        this.contaAberta = contaAberta;

    }

    public void setNumConta(int numConta) {

        this.numConta = numConta;

    }

    public void setTipoConta(String tipoConta) {

        if (tipoConta.equals("CC") || tipoConta.equals("CP")) {

            this.tipoConta = tipoConta;

        } else {

            System.out.println("Tipo de conta inválido (CC ou CP)");
        }

    }

    public void setTitularConta(String titularConta) {

        this.titularConta = titularConta;

    }

    public void setSaldoConta(float saldoConta) {

        this.saldoConta = saldoConta;

    }
    
    public void setValorMensalCC(float valorMensalCC){
    
        this.valorMensalCC = valorMensalCC;
        
    }

    public void setValorMensalCP(float valorMensalCP){
    
        this.valorMensalCP = valorMensalCP;
        
    }
    
    // métodos
    public void abrirConta(String tipoConta) {

        this.contaAberta = true;

    }

    public void creditoInicial(String tipoConta) {

        if (tipoConta.equals("CC")) {

            this.saldoConta = 50.00f;

        }

        if (tipoConta.equals("CP")) {

            this.saldoConta = 150.00f;

        }

    }

    public String fecharConta() {

        float saldo = this.saldoConta;

        String retorno = new String();

        if (saldo < 0) {

            retorno = "Saldo negativo. Cliente em débito. Impossível fechar conta.";

        }

        if (saldo > 0) {

            retorno = "Saldo positivo. Necessário sacar saldo. Impossível fechar conta.";

        }

        if (saldo == 0) {

            this.contaAberta = false;

            retorno = "Conta fechada com sucesso!";

        }

        return retorno;

    }

    public String depositar(float valorDeposito) {

        String retorno = new String();

        boolean contaEstaAberta = this.contaAberta;
        float saldo = this.saldoConta;

        if (contaEstaAberta) {

            saldo += valorDeposito;
            this.saldoConta = saldo;
            retorno = "Depósito efetuado com sucesso!";

        } else {

            retorno = "Conta fechada. Impossível depositar.";

        }

        return retorno;

    }

    public String sacar(float valorSaque) {

        String retorno = new String();

        boolean contaEstaAberta = this.contaAberta;

        if (contaEstaAberta) {

            float saldoAtualConta = this.saldoConta;

            if (saldoAtualConta >= valorSaque) {

                this.saldoConta -= valorSaque;
                retorno = "Saque realizado com sucesso.";

            } else {

                retorno = "Saldo insuficiente.";

            }

        } else {

            retorno = "Conta fechada. Impossível sacar.";

        }

        return retorno;

    }

    public String pagarMensal(String tipoConta) {
        
        String retorno = new String();

        if (this.contaAberta) {

            if (this.saldoConta >= this.valorMensalCC || this.saldoConta >= this.valorMensalCP) {

                switch (tipoConta) {

                    case "CC":
                        this.saldoConta -= this.valorMensalCC;
                        retorno = "Mensalidade debitada - Valor R$ " + this.valorMensalCC;
                        break;

                    case "CP":
                        this.saldoConta -= this.valorMensalCP;
                        retorno = "Mensalidade debitada - Valor R$ " + this.valorMensalCP;
                        break;

                    default:
                        retorno = "Tipo de conta inexistente.";
                        break;

                }

            } else {

                retorno = "Saldo insuficiente. Impossível debitar mensalidade.";

            }

        } else {

            retorno = "Conta fechada. Impossível debitar mensalidade.";

        }
        
        return retorno;

    }

}
