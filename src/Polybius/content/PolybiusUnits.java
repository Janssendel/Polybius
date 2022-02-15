package Polybius.content;


import mindustry.ctype.ContentList;
import mindustry.type.UnitType;

public class UnitTypes implements ContentList{



    public static UnitType
        //yamani/nomorr
        callidryas, tinctorius, ranitomeya, resinifictrix, antongilii, conraua,
        //neo-axar

    private static final Entry<Class<? extends Entityc>, Prov<? extends Entityc>>[] types = new Entry[]{
            prov(NomorUnitType.class, NomorUnitEntity::new),
            prov(NAxarUnitType.class, NAxarUnitEntity::new)
    };
}
