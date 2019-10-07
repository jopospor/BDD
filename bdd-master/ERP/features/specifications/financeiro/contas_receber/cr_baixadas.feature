#language: pt

@ERP @cr_baixadas
Funcionalidade: ERP - CR baixadas

Esquema do Cenário: Excluir desconto de título ou baixa de desconto de título
Dado que a conta recebida foi gerada pela antecipação de recebíveis na "<rotina>"
Quando o usuário excluir a conta recebida
Então é exibida a mensagem:
    """
    Não é possível excluir a Baixa pois ela é referente ao módulo de Desconto de Título.
    """
    
Exemplos:
|          rotina         |
|     desconto_titulos    |
|baixa_titulos_descontados|
