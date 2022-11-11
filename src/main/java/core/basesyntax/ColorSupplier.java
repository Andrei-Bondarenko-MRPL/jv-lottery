package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Color[] colors = Color.values();
    private Random random;
    public String getRandomColor() {
        random = new Random();
        return colors[random.nextInt(colors.length)].name();
    }
}
