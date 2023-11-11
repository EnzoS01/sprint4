package com.example.Sprint4.controlers;

import com.example.Sprint4.entities.ArticuloManufacturado;
import com.example.Sprint4.services.ArticuloManufacturadoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/ArticulosManufacturados")
<<<<<<< Updated upstream
public class ArticuloManufacturadoController extends BaseControllerImpl<ArticuloManufacturado, ArticuloManufacturadoServiceImpl>{
=======
public class ArticuloManufacturadoController extends BaseControllerImpl<ArticuloManufacturado, ArticuloManufacturadoServiceImpl> {

    @GetMapping({"/busquedaPorDenominacion"})
    public ResponseEntity<?> busquedaPorDenominacion(@RequestParam String filtro) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(((ArticuloManufacturadoServiceImpl)this.servicio).findByDenominacionContaining(filtro));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping({"/filtradoPorPrecioDesc"})
    public ResponseEntity<?> filtradoPorPrecioDesc() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(((ArticuloManufacturadoServiceImpl)this.servicio).filtradoPorPrecioDesc());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping({"/filtradoPorPrecioAsc"})
    public ResponseEntity<?> filtradoPorPrecioAsc() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(((ArticuloManufacturadoServiceImpl)this.servicio).filtradoPorPrecioAsc());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/rankingProductos")
    public ResponseEntity<?> rankingProductos(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.filtradoPorProductoVendido());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\":\"" +e.getMessage() +"\"}"));
        }
    }

    @GetMapping("/rankingProductosPorFecha")
    public ResponseEntity<?> rankingProductosPorFecha(@RequestParam Date filtro1, @RequestParam Date filtro2){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.filtradoPorProductoVendidoPorFecha(filtro1,filtro2));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\":\"" +e.getMessage() +"\"}"));
        }
    }



>>>>>>> Stashed changes
}
