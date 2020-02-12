package Creational.Builder.Builder;

import java.util.ArrayList;
import java.util.List;

public class Burger {
    private List<String> layers = new ArrayList<String>();

    Burger() {
        System.out.println("Preparing burger...");
    }

    public void processLayers(List<String> layers) {
        this.layers = layers;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("---Burger Layers---\n");
        for (String layer : layers) {
            stringBuilder.append(layer);
            stringBuilder.append('\n');
        }
        stringBuilder.append("------------------\n");
        return stringBuilder.toString();
    }
}
