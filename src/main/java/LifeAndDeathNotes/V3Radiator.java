package LifeAndDeathNotes;

import java.util.ArrayList;

public class V3Radiator extends V2Radiator{
    V3Radiator(ArrayList lglist){
        super(lglist);
        for(int g=0; g<10; g++){
            lglist.add(new SimUnit("LifeAndDeathNotes.V3Radiator"));
        }
    }
}
