package com.example.Sprint4.services;

import com.example.Sprint4.entities.ArticuloManufacturado;

public interface ArticuloManufacturadoService extends BaseService<ArticuloManufacturado, Long>{
<<<<<<< Updated upstream
=======
    List<ArticuloManufacturado> busquedaPorDenominacion(String filtro) throws Exception;

    List<ArticuloManufacturado> filtradoPorPrecioDesc() throws Exception;

    List<ArticuloManufacturado> filtradoPorPrecioAsc() throws Exception;

    List<RankingProductosDTO> filtradoPorProductoVendido() throws Exception;

    List<RankingProductosDTO> filtradoPorProductoVendidoPorFecha(Date filtro1, Date filtro2) throws Exception;

    List<ArticuloManufacturado> findByDenominacionContaining(String filtro) throws Exception;
>>>>>>> Stashed changes
}
