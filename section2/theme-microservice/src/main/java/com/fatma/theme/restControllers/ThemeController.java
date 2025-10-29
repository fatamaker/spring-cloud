package com.fatma.theme.restControllers;

import com.fatma.theme.dto.ThemeDto;
import com.fatma.theme.service.ThemeService;
import lombok.AllArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/themes")
@AllArgsConstructor
public class ThemeController {

    private ThemeService themeService;

    @GetMapping("{code}")
    public ResponseEntity<ThemeDto> getThemeByCode(@PathVariable("code") String code) {
        return new ResponseEntity<>(
                themeService.getThemeByCode(code),
                HttpStatus.OK
        );
    }
}
