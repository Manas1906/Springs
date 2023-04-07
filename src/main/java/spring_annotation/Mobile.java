package spring_annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
@Value("Oneplus")
String brand;
int ram;
int camera;
}
