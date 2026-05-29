package samsung.abitpro.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import samsung.abitpro.service.VuzopediaParserService;

@RestController
@RequestMapping("/api/parser")
@CrossOrigin(origins = "*")
public class ParserController {

    private final VuzopediaParserService parserService;

    public ParserController(VuzopediaParserService parserService) {
        this.parserService = parserService;
    }
    @PostMapping("/catalog")
    public ResponseEntity<String> parseCatalog(@RequestParam String url) {
        if (url == null || url.trim().isEmpty()) {
            return ResponseEntity.badRequest().body("Параметр URL не может быть пустым.");
        }
        new Thread(() -> {
            try {
                parserService.parseCatalog(url);
            } catch (Exception e) {
                System.err.println("Ошибка во время фонового парсинга каталога: " + e.getMessage());
                e.printStackTrace();
            }
        }).start();

        return ResponseEntity.ok("Фоновый парсинг каталога запущен для URL: " + url + ". Результаты появятся в базе данных в течение нескольких минут.");
    }
    @PostMapping("/university")
    public ResponseEntity<String> parseUniversity(@RequestParam String url, @RequestParam(defaultValue = "Москва") String city) {
        if (url == null || url.trim().isEmpty()) {
            return ResponseEntity.badRequest().body("Параметр URL не может быть пустым.");
        }

        new Thread(() -> {
            try {
                parserService.parseUniversityDetail(url, city);
            } catch (Exception e) {
                System.err.println("Ошибка во время фонового парсинга вуза: " + e.getMessage());
                e.printStackTrace();
            }
        }).start();

        return ResponseEntity.ok("Запущен парсинг вуза по ссылке: " + url + " (Город: " + city + ")");
    }
}
