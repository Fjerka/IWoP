/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.map;

import data.interfaces.IMap;
import data.map.grass.*;

/**
 *
 * @author Stefan
 */
public class MapFactory {

    public IMap create(int id) {
        switch (id) {
            case 110101:
                return new Bush();
            case 110102:
                return new DeepGrass();
            case 110103:
                return new Grass();
            case 110104:
                return new Rock();
            case 110105:
                return new LeafyTreetop();
            case 110106:
                return new LeafyTreeTrunk();
            case 110201:
                return new DirtRoad();
            case 110202:
                return new EastDirtRoad();
            case 110203:
                return new NorthDirtRoad();
            case 110204:
                return new SouthDirtRoad();
            case 110205:
                return new WestDirtRoad();
            case 110206:
                return new NorthEastDirtRoad();
            case 110207:
                return new NorthWestDirtRoad();
            case 110208:
                return new SouthEastDirtRoad();
            case 110209:
                return new SouthWestDirtRoad();
            case 110210:
                return new NorthEastDirtRoadCross();
            case 110211:
                return new NorthWestDirtRoadCross();
            case 110212:
                return new SouthEastDirtRoadCross();
            case 110213:
                return new SouthWestDirtRoadCross();
            case 110301:
                return new River();
            case 110302:
                return new NorthRiverside();
            case 110303:
                return new EastRiverside();
            case 110304:
                return new SouthRiverside();
            case 110305:
                return new WestRiverside();
            case 110306:
                return new NorthEastRiverside();
            case 110307:
                return new NorthWestRiverside();
            case 110308:
                return new SouthEastRiverside();
            case 110309:
                return new SouthWestRiverside();
            case 110310:
                return new NorthEastRiversideCross();
            case 110311:
                return new NorthWestRiversideCross();
            case 110312:
                return new SouthEastRiversideCross();
            case 110313:
                return new SouthWestRiversideCross();
            default:
                return new NullTile();
        }
    }
}
