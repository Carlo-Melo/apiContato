package carlos.contatos.controller;

import carlos.contatos.entity.Contato;
import carlos.contatos.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contatos")
@CrossOrigin(origins = "http://localhost:4200")
public class ContatoController {

    @Autowired
    private ContatoService contatoService;

    @GetMapping
    public List<Contato> listar() {
        return contatoService.listarTodos();
    }

    @PostMapping
    public Contato salvar(@RequestBody Contato contato) {
        return contatoService.salvar(contato);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        contatoService.deletar(id);
    }
}

