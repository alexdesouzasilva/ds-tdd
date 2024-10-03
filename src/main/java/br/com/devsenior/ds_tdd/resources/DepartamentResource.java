package br.com.devsenior.ds_tdd.resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devsenior.ds_tdd.dto.DepartamentDTO;

@RestController
@RequestMapping(value = "/departaments")
public class DepartamentResource {

    @GetMapping
    public ResponseEntity<List<DepartamentDTO>> findAll() {
        List<DepartamentDTO> dto = new ArrayList<>();
        dto.add(new DepartamentDTO(1L, "Management"));
        dto.add(new DepartamentDTO(2L, "Sales"));
        dto.add(new DepartamentDTO(3L, "Training"));
        return ResponseEntity.ok(dto);
    }
    
}
