package edu.eci.cvds.sampleprj.dao.mybatis.mappers;


import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.samples.entities.Item;

/**
 *
 * @author 2106913
 */
public interface ItemMapper {      
    
	public List<Item> consultarItems();        

	public Item consultarItem(@Param("itid") int id);

	public void insertarItem(@Param("it") Item it);

	public List<Object> valorMultaRetrasoxDia(@Param("itemId")int id);

	public abstract long valorMultaAlquiler(@Param("it")int item, @Param("dat")java.sql.Date fecha);

	public List<Item> consultarItemsDisponibles();

	public long consultarCostoAlquiler(@Param("itemId") int iditem);

	public void actualizarTarifaItem(@Param("id")int id, @Param("tarifa")long tarifa);

        
}
