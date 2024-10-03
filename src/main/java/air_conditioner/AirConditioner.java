package air_conditioner;

public class AirConditioner {
    int t1, t2;
    String mode;

    public AirConditioner(int t1, int t2, String mode) {
        this.t1 = t1;
        this.t2 = t2;
        this.mode = mode;
    }

    @Override
    public String toString() {
        return "Conditioner{" +
                "t1=" + t1 +
                ", t2=" + t2 +
                ", mode='" + mode + '\'' +
                '}';
    }

    public int heat() {
        System.out.println("Греем-греем");
        if (t2 > t1)
            return t2;
        else
            return t1;
    }

    public int freeze() {
        System.out.println("Морозим-морозим");
        if (t2 < t1)
            return t2;
        else
            return t1;
    }

    public int auto() {
        System.out.println("авторежим");
        if (t2 > t1)
            return heat();
        else
            return freeze();
    }

    public int fan() {
        System.out.println("гоняем воздух");
        return t1;
    }

    public int work() {
        switch (mode) {
            case "heat":
                return heat();
            case "freeze":
                return freeze();
            case "auto":
                return auto();
            case "fan":
                return fan();
            default:
                return -273;
        }
    }
}
