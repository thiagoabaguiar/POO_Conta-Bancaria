package classes;

public class telaInicial extends javax.swing.JFrame {

    ContaBancaria conta = new ContaBancaria(0, "CC", "Titular"); // cria a conta, mas com status fechada

    public telaInicial() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAbrirConta = new javax.swing.JButton();
        txtNumeroConta = new javax.swing.JTextField();
        txtTitular = new javax.swing.JTextField();
        btnFecharConta = new javax.swing.JButton();
        btnSacar = new javax.swing.JButton();
        btnDepositar = new javax.swing.JButton();
        btnPagarMensal = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblSaldoAtual = new javax.swing.JLabel();
        txtValorSaque = new javax.swing.JTextField();
        txtValorDeposito = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbTipoConta = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAbrirConta.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnAbrirConta.setText("ABRIR");
        btnAbrirConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirContaActionPerformed(evt);
            }
        });

        btnFecharConta.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnFecharConta.setText("FECHAR");
        btnFecharConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharContaActionPerformed(evt);
            }
        });

        btnSacar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnSacar.setText("SACAR");
        btnSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarActionPerformed(evt);
            }
        });

        btnDepositar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnDepositar.setText("DEPOSITAR");
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });

        btnPagarMensal.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnPagarMensal.setText("MENSAL");
        btnPagarMensal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarMensalActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel5.setText("Número da Conta:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel6.setText("Tipo da Conta:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel7.setText("Titular:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel8.setText("Saldo atual:");

        lblSaldoAtual.setText("0");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setText("BANCO");

        cmbTipoConta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "CP" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(395, 395, 395)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNumeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAbrirConta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(cmbTipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(txtTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnFecharConta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtValorSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtValorDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblSaldoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel8)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnPagarMensal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(jLabel5))))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel2)
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaldoAtual)
                    .addComponent(cmbTipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorSaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbrirConta)
                    .addComponent(btnFecharConta)
                    .addComponent(btnSacar)
                    .addComponent(btnDepositar)
                    .addComponent(btnPagarMensal))
                .addContainerGap(267, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // OK
    private void btnAbrirContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirContaActionPerformed

        int numConta = Integer.parseInt(txtNumeroConta.getText());
        String tipoConta = cmbTipoConta.getSelectedItem().toString();
        String titularConta = txtTitular.getText();
        
        String retorno = conta.abrirConta(numConta, tipoConta, titularConta);
        System.out.println(retorno);

        float saldoAtual = conta.getSaldoConta();
        lblSaldoAtual.setText(Float.toString(saldoAtual));

    }//GEN-LAST:event_btnAbrirContaActionPerformed

    // OK
    private void btnFecharContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharContaActionPerformed

        String retorno = conta.fecharConta();

        System.out.println(retorno);

    }//GEN-LAST:event_btnFecharContaActionPerformed

    // OK
    private void btnSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarActionPerformed

        float valorSaque = Float.parseFloat(txtValorSaque.getText());
        String retorno = conta.sacar(valorSaque);
        System.out.println(retorno);

        float saldoAtual = conta.getSaldoConta();
        lblSaldoAtual.setText(Float.toString(saldoAtual));

    }//GEN-LAST:event_btnSacarActionPerformed

    // OK
    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed

        float valorDeposito = Float.parseFloat(txtValorDeposito.getText());
        String retorno = conta.depositar(valorDeposito);
        System.out.println(retorno);

        float saldoAtual = conta.getSaldoConta();
        lblSaldoAtual.setText(Float.toString(saldoAtual));

    }//GEN-LAST:event_btnDepositarActionPerformed

    // OK
    private void btnPagarMensalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarMensalActionPerformed

        String tipoDaConta = conta.getTipoConta();

        String retorno = conta.pagarMensal(tipoDaConta);
        System.out.println(retorno);

        float saldoAtual = conta.getSaldoConta();
        lblSaldoAtual.setText(Float.toString(saldoAtual));

    }//GEN-LAST:event_btnPagarMensalActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaInicial().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirConta;
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnFecharConta;
    private javax.swing.JButton btnPagarMensal;
    private javax.swing.JButton btnSacar;
    private javax.swing.JComboBox<String> cmbTipoConta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblSaldoAtual;
    private javax.swing.JTextField txtNumeroConta;
    private javax.swing.JTextField txtTitular;
    private javax.swing.JTextField txtValorDeposito;
    private javax.swing.JTextField txtValorSaque;
    // End of variables declaration//GEN-END:variables
}
