class Compra {
    String id;
    int ref;
    private float valor;
    String fecha; // No se como se hace el menejo de los tipo date

    public Compra(String id, int ref, float valor, String fecha) {
        super();
        this.id = id;
        this.ref = ref;
        this.valor = valor;
        this.fecha = fecha;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return this.valor;
    }

    public float pagar(int vip) {
        float descuento;
        if (vip == 1) {
            descuento = this.valor * ((float) (0.1));
            this.valor = this.valor - descuento;
        } else {
            if (valor >= 100000 && valor <= 250000) {
                descuento = this.valor * ((float) (0.05));
                this.valor = this.valor - descuento;
            } else if (valor > 250000) {
                descuento = this.valor * ((float) (0.07));
                this.valor = this.valor - descuento;
            } else if (valor < 100000 && valor > 0) {
                descuento = 0;
                this.valor = this.valor - descuento;
            }
        }
        return this.valor;
    }

}