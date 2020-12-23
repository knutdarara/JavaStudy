package interfaceEx;

public class Queue extends Structure {

    @Override
    public void Push(Object value) {
        objectList.add(value);
    }

    @Override
    public Object Pop() {
        if (objectList.size() > 0) {
            Object result = objectList.get(0);
            objectList.remove(0);
            return result;
        } else {
            return null;
        }
    }
}
