package web.service;

import java.util.List;

public class CarService {
    public static List limitList(List cars, Integer count){
        if ((count == 0) || (count>4)) { return cars;}
        else {
            return cars.stream().limit(count).toList();
        }
    }
}
