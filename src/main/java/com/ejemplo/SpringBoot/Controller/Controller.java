package com.ejemplo.SpringBoot.Controller;

import com.ejemplo.SpringBoot.Model.Domicilio;
import com.ejemplo.SpringBoot.Model.Educacion;
import com.ejemplo.SpringBoot.Model.ExperienciaLaboral;
import com.ejemplo.SpringBoot.Model.Habilidades;
import com.ejemplo.SpringBoot.Model.Idiomas;
import com.ejemplo.SpringBoot.Model.Persona;
import com.ejemplo.SpringBoot.Model.Proyectos;
import com.ejemplo.SpringBoot.Model.TipoEmpleo;
import com.ejemplo.SpringBoot.service.IDomicilioService;
import com.ejemplo.SpringBoot.service.IEducacionService;
import com.ejemplo.SpringBoot.service.IExperienciaLaboralService;
import com.ejemplo.SpringBoot.service.IHabilidadesService;
import com.ejemplo.SpringBoot.service.IIdiomasService;
import com.ejemplo.SpringBoot.service.IPersonaService;
import com.ejemplo.SpringBoot.service.IProyectosService;
import com.ejemplo.SpringBoot.service.ITipoEmpleoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

//Implementación Persona
    @Autowired
    private IPersonaService persoServ;
       
    @PostMapping("/new/persona")
    public void agregarPersona (@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
    }
    
    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona (@PathVariable Integer id){
        persoServ.borrarPersona(id);
    }
    
    @PutMapping("/edit/persona")
    public void editarPersona (@RequestBody Persona pers) {
        persoServ.editarPersona(pers);
    }
    
//Implementación Domicilio
    @Autowired
    private IDomicilioService domiServ;
       
    @PostMapping("/new/domicilio")
    public void agregarDomicilio (@RequestBody Domicilio domi) {
        domiServ.crearDomicilio(domi);
    }
    
    @GetMapping("/ver/domicilios")
    @ResponseBody
    public List<Domicilio> verDomicilios(){
        return domiServ.verDomicilios();
    }
    
    //@DeleteMapping ("/delete/{id}")
    //public void borrarDomicilio (@PathVariable Integer id){
    //    domiServ.borrarDomicilio(id);
    //}
    
//Implementación Educacion
    @Autowired
    private IEducacionService educServ;
       
    @PostMapping("/new/educacion")
    public void agregarEducacion (@RequestBody Educacion educ) {
        educServ.crearEducacion(educ);
    }
    
    @GetMapping("/ver/educacion")
    @ResponseBody
    public List<Educacion> verEducaciones(){
        return educServ.verEducaciones();
    }
    
    //@DeleteMapping ("/delete/{id}")
    //public void borrarEducacion (@PathVariable Integer id){
    //    educServ.borrarEducacion(id);
    //}
    
//Implementación Experiencia Laboral
    @Autowired
    private IExperienciaLaboralService expeServ;
       
    @PostMapping("/new/experiencia_laboral")
    public void agregarExperienciaLaboral (@RequestBody ExperienciaLaboral expe) {
        expeServ.crearExperienciaLaboral(expe);
    }
    
    @GetMapping("/ver/experiencia_laboral")
    @ResponseBody
    public List<ExperienciaLaboral> verExperienciasLaborales(){
        return expeServ.verExperienciasLaborales();
    }
    
    //@DeleteMapping ("/delete/{id}")
    //public void borrarExperienciaLaboral (@PathVariable Integer id){
    //    expeServ.borrarExperienciaLaboral(id);
    //}
    
//Implementación Habilidades
    @Autowired
    private IHabilidadesService habiServ;
       
    @PostMapping("/new/habilidad")
    public void agregarHabilidad (@RequestBody Habilidades habi) {
        habiServ.crearHabilidad(habi);
    }
    
    @GetMapping("/ver/habilidad")
    @ResponseBody
    public List<Habilidades> verHabilidades(){
        return habiServ.verHabilidades();
    }
    
    //@DeleteMapping ("/delete/{id}")
    //public void borrarHabilidad (@PathVariable Integer id){
    //    habiServ.borrarHabilidad(id);
    //}
    
//Implementación Idiomas
    @Autowired
    private IIdiomasService idioServ;
       
    @PostMapping("/new/idioma")
    public void agregarIdioma (@RequestBody Idiomas idio) {
        idioServ.crearIdioma(idio);
    }
    
    @GetMapping("/ver/idiomas")
    @ResponseBody
    public List<Idiomas> verIdiomas(){
        return idioServ.verIdiomas();
    }
    
    //@DeleteMapping ("/delete/{id}")
    //public void borrarIdioma (@PathVariable Integer id){
    //    idioServ.borrarIdioma(id);
    //}
    
//Implementación Proyectos
    @Autowired
    private IProyectosService proyServ;
       
    @PostMapping("/new/proyecto")
    public void agregarProyecto (@RequestBody Proyectos proy) {
        proyServ.crearProyecto(proy);
    }
    
    @GetMapping("/ver/proyecto")
    @ResponseBody
    public List<Proyectos> verProyectos(){
        return proyServ.verProyectos();
    }
    
    //@DeleteMapping ("/delete/{id}")
    //public void borrarProyecto (@PathVariable Integer id){
    //    proyServ.borrarProyecto(id);
    //}
    
//Implementación Tipo de Empleo
    @Autowired
    private ITipoEmpleoService tipoServ;
       
    @PostMapping("/new/tipo_empleo")
    public void agregarTipoEmpleo (@RequestBody TipoEmpleo tipo) {
        tipoServ.crearTipoEmpleo(tipo);
    }
    
    @GetMapping("/ver/tipo_empleo")
    @ResponseBody
    public List<TipoEmpleo> verTipoEmpleo(){
        return tipoServ.verTipoEmpleo();
    }
    
    //@DeleteMapping ("/delete/{id}")
    //public void borrarTipoEmpleo (@PathVariable Integer id){
    //    tipoServ.borrarTipoEmpleo(id);
    //}
   
    
}
