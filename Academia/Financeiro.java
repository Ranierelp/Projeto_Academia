public class Financeiro {

    private Academia academia;
    private double receita = 0;
    private double despesas = 0;


    //Sets e Gets Padrões

    public Academia getAcademia() {
        return academia;
    }

    public void setAcademia(Academia academia) {
        this.academia = academia;
    }

    public double getReceita() {
        return receita;
    }

    public void setReceita(double receita){
        this.receita = receita;
        
    }

    public double getDespesas() {
        return despesas;
    }

    public void setDespesas(double despesas) {
        this.despesas = despesas;
    }
}
