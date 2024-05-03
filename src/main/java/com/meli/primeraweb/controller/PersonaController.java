package com.meli.primeraweb.controller;

import com.meli.primeraweb.entities.Persona;
import com.meli.primeraweb.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/personas")
public class PersonaController {
    @Autowired
    private PersonaService personaService;
//La clase model se utiliza pra tranferir objetos del controller a la vista
    @GetMapping
    public String listarPersonas(Model model) {
        List<Persona> personas;
        personas = personaService.obtenerTodas();
        model.addAttribute("listaPersonas",personas);//Key-Valor
        System.out.println("lista"+personas);
        return "Listar";

    }
    @GetMapping("/nueva")
    public  String mostrarFormularioNuevaPersona(Model model){
        model.addAttribute("persona",new Persona());
        model.addAttribute("Accion","/personas/nueva");


        return"formulario";

    }
    @PostMapping("/nueva")
    public String guardarPersona(@ModelAttribute Persona persona ){
        personaService.crearPersona(persona);
        return "redirect:/personas";

    }
    @GetMapping("/editar/{id}")
    public  String mostrarFormularioEditarPersona(@PathVariable Long id,@ModelAttribute Persona persona, Model model ){
        model.addAttribute("persona",persona);
        model.addAttribute("Accion","/personas/editar"+id);
        return"formulario";

    }

@PostMapping("/editar/{id}")
   public String actualizarPersona(@PathVariable Long id,@ModelAttribute Persona persona){
        personaService.actualizarPersona(id, persona);

        return "redirect:/personas";//redirecciona al endpoint de estado
   }
    @GetMapping("/eliminar/{id}")
    public String eliminarPersona(@PathVariable Long id){
        personaService.borrarPersona(id);
        return "redirect:/personas";
    }
}
