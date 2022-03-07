package Taller;

public class Gato {
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

    public Gato() {
        raza = new String();
        energia = 0;
        nivelalimento = 0;
        color = new String();
    }

    // Metodo que permite modificar el atributo color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Metodo que permite dar valor por entrada a raza
    public String raza() {
        return raza;
    }

    public void raza(String raza) {
        this.raza = raza;
    }

    // metodo que permite dar valor a energia por entrada
    public int energia() {
        return energia;
    }

    public void energia(int energia) {
        this.energia = energia;
    }

    // metodo que permite dar valor a la alimentacion por entrada

    public int nivelalimento() {
        return nivelalimento;
    }

    public void nivelalimento(int nivelalimento) {
        this.nivelalimento = nivelalimento;
    }

    public void comer(int comida) {
        if (nivelalimento >= 100) {
            nivelalimento = 100;
            System.out.println("El gato esta lleno" + "\n");
        } else {
            switch (comida) {
                case (10):
                    this.nivelalimento += 10;
                    if (nivelalimento >= 100) {
                        nivelalimento = 100;
                    }
                    System.out.println("El gato ha comido ahora esta al " + nivelalimento + "%" + "\n");
                    break;
                case 20:
                    this.nivelalimento += 20;
                    if (nivelalimento >= 100) {
                        nivelalimento = 100;
                    }
                    System.out.println("El gato ha comido ahora esta al " + nivelalimento + "%" + "\n");
                    break;
                case 30:
                    this.nivelalimento += 30;
                    if (nivelalimento >= 100) {
                        nivelalimento = 100;
                    }
                    System.out.println("El gato ha comido ahora esta al " + nivelalimento + "%" + "\n");
                    break;
                case 40:
                    this.nivelalimento += 40;
                    if (nivelalimento >= 100) {
                        nivelalimento = 100;
                    }
                    System.out.println("El gato ha comido ahora esta al " + nivelalimento + "%" + "\n");
                    break;
                case 50:
                    this.nivelalimento += 50;
                    if (nivelalimento >= 100) {
                        nivelalimento = 100;
                    }
                    System.out.println("El gato ha comido ahora esta al " + nivelalimento + "%" + "\n");
                    break;
                case 60:
                    this.nivelalimento += 60;
                    if (nivelalimento >= 100) {
                        nivelalimento = 100;
                    }
                    System.out.println("El gato ha comido ahora esta al " + nivelalimento + "%" + "\n");
                    break;
                case 70:
                    this.nivelalimento += 70;
                    if (nivelalimento >= 100) {
                        nivelalimento = 100;
                    }
                    System.out.println("El gato ha comido ahora esta al " + nivelalimento + "%" + "\n");
                    break;
                case 80:
                    this.nivelalimento += 80;
                    if (nivelalimento >= 100) {
                        nivelalimento = 100;
                    }
                    System.out.println("El gato ha comido ahora esta al " + nivelalimento + "%" + "\n");
                    break;
                case 90:
                    this.nivelalimento += 90;
                    if (nivelalimento >= 100) {
                        nivelalimento = 100;
                    }
                    System.out.println("El gato ha comido ahora esta al " + nivelalimento + "%" + "\n");
                    break;
                case 100:
                    this.nivelalimento += 100;
                    if (nivelalimento >= 100) {
                        nivelalimento = 100;
                    }
                    System.out.println("El gato ha comido ahora esta al " + nivelalimento + "%" + "\n");
                    break;
                default:
                    System.out.println("El gato no quiere comer porque no seguiste las indicaciones :'( " + "\n");
            }
        }
    }

    public void dormir(int horas) {
        if (energia >= 100) {
            energia = 100;
            System.out.println("El gato ya durmio mucho" + "\n");
        }

        else {

            switch (horas) {
                case 1:
                    this.energia += 10;
                    if (energia >= 100) {
                        energia = 100;
                    }
                    System.out.println("el gato tomo una siesta ahora esta al " + energia + "%" + "\n");
                    break;
                case 2:
                    this.energia += 20;
                    if (energia >= 100) {
                        energia = 100;
                    }
                    System.out.println("el gato tomo una siesta ahora esta al " + energia + "%" + "\n");
                    break;
                case 3:
                    this.energia += 30;
                    if (energia >= 100) {
                        energia = 100;
                    }
                    System.out.println("el gato tomo una siesta ahora esta al " + energia + "%" + "\n");
                    break;
                case 4:
                    this.energia += 40;
                    if (energia >= 100) {
                        energia = 100;
                    }
                    System.out.println("el gato tomo una siesta ahora esta al " + energia + "%" + "\n");
                    break;
                case 5:
                    this.energia += 50;
                    if (energia >= 100) {
                        energia = 100;
                    }
                    System.out.println("el gato tomo una siesta ahora esta al " + energia + "%" + "\n");
                    break;
                case 6:
                    this.energia += 60;
                    if (energia >= 100) {
                        energia = 100;
                    }
                    System.out.println("el gato tomo una siesta ahora esta al " + energia + "%" + "\n");
                    break;
                case 7:
                    this.energia += 70;
                    if (energia >= 100) {
                        energia = 100;
                    }
                    System.out.println("el gato tomo una siesta ahora esta al " + energia + "%" + "\n");
                    break;
                case 8:
                    this.energia += 80;
                    if (energia >= 100) {
                        energia = 100;
                    }
                    System.out.println("el gato tomo una siesta ahora esta al " + energia + "%" + "\n");
                    break;
                case 9:
                    this.energia += 90;
                    if (energia >= 100) {
                        energia = 100;
                    }
                    System.out.println("el gato tomo una siesta ahora esta al " + energia + "%" + "\n");
                    break;
                case 10:
                    this.energia += 100;
                    if (energia >= 100) {
                        energia = 100;
                    }
                    System.out.println("el gato tomo una siesta ahora esta al " + energia + "%" + "\n");
                    break;
                default:
                    System.out.println("El gato no quiere dormir tanto" + "\n");
            }
        }

    }

    public void jugar() {
        if (this.energia <= 0 || this.nivelalimento <= 1) {
            System.out.println("el gato no quiere jugar más por ahora" + "\n" + "Dale de comer o dejalo dormir" + "\n");
        } else {
            this.energia -= 10;
            this.nivelalimento -= 10;
            System.out.println("Jugando con el gato" + "\n" + "......." + "\n" + "......." + "\n");
            System.out.println("al gato le encanta jugar");
            System.out.println("La energia del gato ahora es de " + energia + " y el nivel de alimentacion es de "
                    + nivelalimento + "\n");
        }
    }

    public void acariciar() {
        System.out.println("prrrr");
    }

}