package Taller;

class Gato {
    String raza;
    private String color;
    int energia;
    int nivelalimento;

    // Constructor de la clase Gato
    public Gato(String raza, String color, int energia, int nivelalimento) {
        super();
        this.raza = raza;
        this.color = color;
        this.energia = energia;
        this.nivelalimento = nivelalimento;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void comer(int comida) {
        if (comida > 10) {
            System.out.println("El gato no quiere comer porque no seguiste las indicaciones :'( " + "\n");
        } else {
            if (nivelalimento >= 100) {
                nivelalimento = 100;
                System.out.println("El gato esta lleno" + "\n");
            } else {

                this.nivelalimento += comida * 10;
                if (nivelalimento >= 100) {
                    nivelalimento = 100;
                }
                System.out.println("El gato ha comido ahora esta al " + nivelalimento + "%" + "\n");
            }
        }
    }

    public void dormir(int horas) {

        if (horas > 8) {
            System.out.println("El gato no quiere dormir tanto" + "\n");
        } else {
            if (energia >= 100) {
                energia = 100;
                System.out.println("El gato ya durmio mucho" + "\n");
            }

            else {
                this.energia += horas * 10;
                if (energia >= 100) {
                    energia = 100;
                }
                System.out.println("el gato tomo una siesta ahora esta al " + energia + "%" + "\n");
            }
        }
    }

    public void jugar(int juego) {
        int n = 0;
        if (this.energia <= 1 || this.nivelalimento <= 1) {
            System.out.println("el gato no quiere jugar más por ahora" + "\n" + "Dale de comer o dejalo dormir" + "\n");
        } else {

            while (n < juego) {
                this.energia -= 5;
                this.nivelalimento -= 5;
                n += 1;
            }
            if (energia < 0 || nivelalimento < 0) {
                energia = 1;
                nivelalimento = 1;
                System.out.println("El gato no puede seguir jugando");

            } else {
                System.out.println("Jugando con el gato" + "\n" + "......." + "\n" + "......." + "\n");
                System.out.println("al gato le encanta jugar");
                System.out.println("La energia del gato ahora es de " + energia + " y el nivel de alimentacion es de "
                        + nivelalimento + "\n");
            }
        }
    }

    public void acariciar() {
        System.out.println("prrrr");
    }

}