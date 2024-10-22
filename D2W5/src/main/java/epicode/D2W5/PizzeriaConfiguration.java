package epicode.D2W5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PizzeriaConfiguration {
    @Value("${coperto}")
    private double coperto;

    public double getCoperto() {
        return coperto;
    }
}
