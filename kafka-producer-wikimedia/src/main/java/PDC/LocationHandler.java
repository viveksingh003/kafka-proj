package PDC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationHandler {/*implements PDC.EntityTypeHandler<LocationType>{
    private final LocationMapper locationMapper;
    private final EntitySetupService<SegShippingLocationType> entitySetupService;

    @Autowired
    public PDC.LocationHandler(LocationMapper locationMapper ,ErrorHandler errorHandler){
        this.locationMapper=locationMapper;
        this.entitySetupService=new EntitySetupService<>(SegShippingLocationType.class,errorHandler,LOCATION);

    }

    @Override
    public void create (List<Locationtype> entities){{entitySetupService.addEntity(map(entities));}
    @Override
    public void update (List<Locationtype> entities){entitySetupService.changeEntity(map(entities));}
    //same for delete

        private List<SegShippingLocationType> map(List<LocationType> entities){
    return locationMapper.map(entities);
    }
    @Override
            public EntityType getEntityName(){return LOCATION;}
        @Override
                public DocumentActionEnumerationType getDocumentActionCode(LocationType locattion){
        return location.getDocumentActionCode();}
        }
    }
*/

}
