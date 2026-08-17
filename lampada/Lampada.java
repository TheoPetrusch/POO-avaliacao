package lampada;

public class Lampada {
    private boolean luz;
    private int watts;

    public Lampada(boolean luz, int watts){
        this.luz = luz;
        this.watts = watts;
    }

    public Lampada(){
        watts = 60;
    }

    public boolean interruptor(boolean luz){
        if (luz == true){
            luz = false;
        }
        else if (luz == false){
            luz = true;
        }
        return luz;
    }

    public String retornaC(boolean luz){
        if (luz == true){
            System.out.println("A luz está acesa");
            System.out.println(watts);
        }
        else if (luz == false){
             System.out.println("A luz está apagada");
             System.out.println(watts);
        }
        return "";
    }

    public int getWatts(){
        return watts;
    }

    public void setWatts(int watts){
        if (watts >= 1 && watts <= 100){
            this.watts = watts;
        }
    }
}


