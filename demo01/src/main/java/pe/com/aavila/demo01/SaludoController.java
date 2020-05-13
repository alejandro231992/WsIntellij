package pe.com.aavila.demo01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping(value = "saludo")
public class SaludoController {
    private final AtomicLong counter = new AtomicLong();
    private static final String template = "Hello %s";
    @GetMapping
    public Saludo saludo(@RequestParam(value = "name",defaultValue = "World") String name){
        return new Saludo(counter.incrementAndGet(), String.format(template,name));
    }
}
