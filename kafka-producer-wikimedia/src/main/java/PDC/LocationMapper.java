package PDC;

public interface LocationMapper {}/*extends EntityMapper<LocationType> , BusinessHoursMapper{

    @Override
    default List<SegShippingLocationType> map(List<LocationType> entities){

        return entities.stream().map(this::mapToShippingLocationType.toList)();

    }

    @Mapping(source="locationType" , target="liveunloadCodeEnumVal" , qualifiedByName="getCodeMapInbound")
    @Mapping(source="locationType" , target ="maximumShipmentWeight",qualifiedByName="getCodeMapOutbound")
    @Mapping(source="locationId" , target ="shippingLocationCode")
    SegShippingLocationType mapToShippingLocationType(LocationType locationType)

        //many code here with some with @named

    default EntityType getEntityName(){
        return LOCATION
    }
*/

