package interfaceEx;

import java.util.ArrayList;
import java.util.List;

interface StructureInterface {
    List<Object> objectList = new ArrayList<>();

    public void Push(Object value);

    public Object Pop();
}
